package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int somaFat = 1;
		System.out.println("qual numero a fatorar?");
		int valor = ler.nextInt();
		
		for (int i = valor; i > 0; i--) {
			if(i == valor) {
				System.out.print(i);
			}else {
				System.out.print("."+i);
			}
			somaFat *= i;
		}
		System.out.println(" = "+somaFat);
		ler.close();

	}

}
