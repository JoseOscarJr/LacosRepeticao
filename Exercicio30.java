package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 4;
		int[] cod = new int[TAM];
		double[] medidas = new double[TAM];
		double mediaPeso = 0;
		double mediaAltura = 0;
		int codigo = 0;
		double peso= 0;
		double altura = 0;
		int cont = 0;
		do {
			System.out.print("Informe seu codigo: ");
			codigo = ler.nextInt();
			if(codigo != 0) {
				System.out.print("Informe seu peso: ");
				peso = ler.nextDouble();
			
				System.out.print("Informe sua altura: ");
				altura = ler.nextDouble();
				if(cont == 0) {
					for (int i = 0; i < TAM; i++) {
						cod[i] = codigo;
					}
					medidas[0] = peso;
					medidas[1] = peso;
					medidas[2] = altura;
					medidas[3] = altura;
				}
				if(peso> medidas[0]) {
					medidas[0] = peso;
					cod[0] = codigo;
				}else if(peso < medidas[1]) {
					medidas[1] = peso;
					cod[1] = codigo;

				}
				if(altura > medidas[2]) {
					medidas[2] = altura;
					cod[2] = codigo;

				}else if(altura < medidas[3]) {
					medidas[3] = altura;
					cod[3] = codigo;

				}
				mediaAltura += altura;
				mediaPeso += peso;
				cont++;
			}
			
		}while(codigo != 0);
		System.out.println("Mais Pesado cod "+cod[0]+" Peso "+medidas[0]+"Kg");
		System.out.println("Mais leve cod "+cod[1]+" Peso "+medidas[1]+"Kg");
		System.out.println("Mais alto cod "+cod[2]+" Altura "+medidas[2]+"m");
		System.out.println("Mais baixo cod "+cod[3]+" Altura "+medidas[3]+"m");
		System.out.println("Media de peso"+(mediaPeso/cont));
		System.out.println("Media de Altura"+(mediaAltura/cont));
		ler.close();

	}

}
