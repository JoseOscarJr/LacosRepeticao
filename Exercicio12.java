package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int aux1 = 0;
		int aux2 = 1;
		int fibo = 0;
		System.out.println("Até que numero ir a serie?");
		int valor = ler.nextInt();
		
		for (int i = 0; i < valor; i++) {
			if(i == 0) {
				System.out.print(aux1+" "+aux2+" ");
			}
			fibo = aux1 + aux2;
			aux1 = aux2;
			aux2 = fibo;
			System.out.print(fibo+" ");
		}
		ler.close();

	}

}
