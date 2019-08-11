package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int contPar = 0;
		int contImpar = 0;
		final int TAM = 10;
		int numero;
		for (int i = 0; i < TAM; i++) {
			System.out.print("Digite o "+(i+1)+"° numero: ");
			numero = ler.nextInt();
			
			if (numero % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}
		System.out.println("Existe "+contPar+ " numero par");
		System.out.println("Existe "+contImpar+ " numero impar");
		ler.close();
	}

}
