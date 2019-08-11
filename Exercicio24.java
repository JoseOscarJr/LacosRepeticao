package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		System.out.print("informe quantos cds: ");
		int num = ler.nextInt();
		double soma = 0;
		
		for (int i = 0; i < num; i++) {
			double valor;
			System.out.print("informe o valor do CD: "+(i+1)+" : ");
			valor= ler.nextDouble();
			soma+= valor;
				
		}
		System.out.println("media de custo por cd "+ (soma/num));
		ler.close();

	}

}
