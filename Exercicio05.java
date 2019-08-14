package ExerciciosAula2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner ler =new  Scanner(System.in);
		
		final int TAM = 20;
		for (int i = 0; i < TAM; i++) {
			System.out.println(i);
		}
		for (int i = 0; i < TAM; i++) {
			System.out.print(i+" ");
		}
		ler.close();
	}

}
