package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner ler  = new Scanner(System.in);
		
		int op = 0;
		final int TAM =4;
		int[] cont = new int[TAM];
		while (op >= 0) {
			
			System.out.println("Informe um numero: ");
			op = ler.nextInt();
			
			if(op >= 0 && op <= 25 ) {
				cont[0] = cont[0] + 1;
				
			}else if(op >= 26 && op <= 50 ) {
				cont[1] = cont[1] + 1;
				
			}else if(op >= 51 && op <= 75 ) {
				cont[2] = cont[2] + 1;
				
			}else if(op >= 76 && op <= 100 ) {
				cont[3] = cont[3] + 1;
			}
		}
		System.out.println("Contagem de 0 a 25 existe "+cont[0]+" numeros");
		System.out.println("Contagem de 26 a 50 existe "+cont[1]+" numeros");
		System.out.println("Contagem de 51 a 75 existe "+cont[2]+" numeros");
		System.out.println("Contagem de 76 a 100 existe "+cont[3]+" numeros");
		ler.close();
	}

}
