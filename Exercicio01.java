package ExerciciosAula2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int resposta;
		
		do {
			System.out.println("Digite uma nota (0 a 10): ");
			resposta = entrada.nextInt();
		}while (resposta < 0 || resposta > 10);
		System.out.println("Nota Confirmada");
		entrada.close();
	}

}
