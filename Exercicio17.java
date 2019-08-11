package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("informe um numero: ");
		int num = ler.nextInt();
		boolean primo = true;
		for (int i = 2; i < num; i++) {
	
				if(num % i == 0) {
					primo = false;
				}
			}
		
		if (primo) 
			System.out.println("Numero "+num+" é primo");
		else
			System.out.println("Numero "+num+" não é primo");
		ler.close();

	}

}
