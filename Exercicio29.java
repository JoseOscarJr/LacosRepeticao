package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int inicio = 0;
		int fim = 0;
		int valTab = 0;
		do {
			System.out.print("Informe o inicio da tabuada: ");
			inicio = ler.nextInt();
			System.out.print("Informe o fim da tabuada: ");
			fim = ler.nextInt();
			
		} while (inicio> fim);
		
		System.out.print("Informe o valor da tabuada: ");
		valTab = ler.nextInt();
		
		for(int i =inicio; i < fim+1; i++) {
			System.out.println(valTab+" x "+ i+" = "+(valTab*i) );
		}
		ler.close();
	}

}
