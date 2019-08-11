package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int aux1 =38;
		int aux2 = 1;

		int soma = 0;
		System.out.print("S = ");
		for (int i = aux1; i > 1; i--) {
			
			soma += ((i-1)*i)/aux2;
			System.out.print("("+(i-1)+")*("+i+") / "+aux2);
			if(i != 1) {
				System.out.print(" + ");
			}
			aux2++;
			
		}
		System.out.print(" = "+soma);
		ler.close();
	}

}
