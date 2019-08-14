package ExerciciosAula2;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner ler =new  Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero1 = ler.nextInt();
		
		System.out.println("Digite um numero: ");
		int numero2 = ler.nextInt();
		
		if(numero1 > numero2) {
			for (int i = numero2+1; i < numero1; i++) {
				System.out.println(i);
			}
		}else {
			for (int i = numero1+1; i < numero2; i++) {
				System.out.println(i);
			}
		}
		ler.close();
	}	

}
