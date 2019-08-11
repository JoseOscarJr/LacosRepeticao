package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("informe um numero: ");
		int num = ler.nextInt();
		boolean primo = true;
		for (int i = 2; i < num; i++) {
			
				if(num % i == 0) {
					if(primo)
						System.out.print("divisores ");
					
					primo = false;
					System.out.print(" "+ i);
				}
			}
		
		if (primo) 
			System.out.println("\nNumero "+num+" é primo");
		else
			System.out.println("\nNumero "+num+" não é primo");
		ler.close();


	}

}
