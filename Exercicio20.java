package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("informe quantas notas: ");
		int num = ler.nextInt();
		double soma = 0;
		double nota = 0;
		for (int i = 0; i < num; i++) {
			System.out.print("Informe as notas: ");
			nota = ler.nextDouble();
			
			soma += nota;
		}
		System.out.println("Media: "+(soma/num));
		ler.close();


	}

}
