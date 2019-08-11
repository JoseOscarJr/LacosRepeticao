package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("informe quantos votantes: ");
		int num = ler.nextInt();
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		
		for (int i = 0; i < num; i++) {
			System.out.print("Informe o seu voto (1,2,3): ");
			int voto = ler.nextInt();
			
			if(voto == 1) {
				cont1++;
				
			}else if(voto == 2) {
				cont2++;
				
			}else if(voto == 3) {
				cont3++;
			}
		}
		System.out.println("Candidato 1 votos = "+ cont1);
		System.out.println("Candidato 2 votos = "+ cont2);
		System.out.println("Candidato 3 votos = "+ cont3);
		
		ler.close();
	}

}
