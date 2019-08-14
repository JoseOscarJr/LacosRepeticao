package ExerciciosAula2;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner ler =new  Scanner(System.in);
		
		int soma = 0;
		System.out.println("Digite um numero: ");
		int numero1 = ler.nextInt();
		
		System.out.println("Digite um numero: ");
		int numero2 = ler.nextInt();
		if(numero1 > numero2) {
			for (int i = numero2; i < numero1; i++) {
				System.out.println(i);
				soma+= i;
			}
		}else {
			for (int i = numero1; i < numero2; i++) {
				System.out.println(i);
				soma+= i;
			}
		}
		System.out.println("Soma "+ soma);
		ler.close();
	}

}
