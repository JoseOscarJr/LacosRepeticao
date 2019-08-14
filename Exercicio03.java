package ExerciciosAula2;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		do {
			System.out.println("Digite seu nome: ");
			nome = entrada.nextLine();
		} while (nome.length() < 3);
		do {
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
		} while (idade < 0 || idade > 150);
		do {
			System.out.println("Digite seu Salario: ");
			salario = entrada.nextDouble();
		} while (salario < 0);
		do {
			System.out.println("Digite seu sexo:  ");
			sexo = entrada.next();
			System.out.println(sexo);
		} while ((!"f".equalsIgnoreCase((sexo)) || (!"m".equalsIgnoreCase(sexo))));
		do {
			System.out.println("Digite seu estado civil:  ");
			estadoCivil = entrada.nextLine();
		} while (!"s".equalsIgnoreCase(estadoCivil) || !"c".equalsIgnoreCase(estadoCivil) ||!"v".equalsIgnoreCase(estadoCivil) || !"d".equalsIgnoreCase(sexo));
		
		
		

	}

}
