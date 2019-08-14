package ExerciciosAula2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner ler =new  Scanner(System.in);
		
		int resultado = 0;
		System.out.println("Digite a base: ");
		int base = ler.nextInt();
		
		System.out.println("Digite o expoente: ");
		int expoente = ler.nextInt();
		
		for (int i = 1; i < expoente; i++) {
			System.out.println(resultado);
			if(i == 1) {
				resultado = base * base;
			}else {
				resultado *= base;
			}
		}
		System.out.println("Resultado "+ resultado);
		ler.close();
	}

}
