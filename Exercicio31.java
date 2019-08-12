package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int[] cod = new int[TAM];
		int[] medidas = new int[TAM];
		int codigoMaisAlto = 0;
		int codigoMaisBaixo = 0;
		int maisAlto = 0;
		int maisBaixo = 0;
		
		for (int i = 0; i < medidas.length; i++) {
			System.out.print("Informe o codigo do aluno: ");
			cod[i] = ler.nextInt();
			System.out.print("Informe a Altura do aluno: ");
			medidas[i] = ler.nextInt();
		}
		maisAlto = medidas[0];
		maisBaixo = medidas[0];
		for (int i = 0; i < medidas.length; i++) {
			if(medidas[i] > maisAlto) {
				maisAlto = medidas[i];
				codigoMaisAlto = i;
			}else if(medidas[i] < maisBaixo) {
				maisBaixo = medidas[i];
				codigoMaisBaixo = i;
			}
		}
		System.out.println("Mais Alto: "+ maisAlto+" cod "+ cod[codigoMaisAlto]);
		System.out.println("Mais Baixo: "+ maisBaixo+ " cod " + cod[codigoMaisBaixo]);
		ler.close();
	}

}
