package ExerciciosAula2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		String senha;
		do {
			System.out.println("Digite seu nome: ");
			nome = entrada.nextLine();
			System.out.println("Digite sua senha: ");
			senha = entrada.nextLine();
			
		}while (nome.equalsIgnoreCase(senha));
		System.out.println("Senha confirmada Confirmada");
		entrada.close();

	}

}
