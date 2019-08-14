package ExerciciosAula2;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner ler =new  Scanner(System.in);
		
		final int TAM = 11;
		
		System.out.println("Digite um numero para a multiplicação: ");
		int numero = ler.nextInt();
		
		for (int i = 1; i < TAM; i++) {
			
			System.out.println(numero+ " x "+i +"= "+ i*numero);
		}
		ler.close();
	
	}

}
