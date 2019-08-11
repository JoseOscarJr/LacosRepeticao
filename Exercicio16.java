package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int maior =0;
		int menor =0;
		int soma = 0;
		System.out.print("informe um numero: ");
		int num = ler.nextInt();
		int num2 = 0;
		for (int i = 0; i < num; i++) {
			System.out.print("informe um numero: ");
			num2 = ler.nextInt();
			if(i == 0) {
				maior = num2;
				menor = num2;
			}
			if(num2 > maior) {
				maior = num2;
			}else if(num2 < menor) {
				menor = num2;
			}
			soma+= num2;
			
		}
		System.out.println("Maior "+ maior);
		System.out.println("Menor "+ menor);
		System.out.println("soma "+ soma);
		
		ler.close();

	}

}
