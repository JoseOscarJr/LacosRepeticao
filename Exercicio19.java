package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("informe um numero: ");
		int num = ler.nextInt();
		int aux;
		int cont = 0;
		for (int j = 2; j < num; j++) {
			aux = j;
			boolean primo = true;
			for (int i = 2; i < aux; i++) {
					cont++;
					if(aux% i == 0) {
						if(primo)
						primo = false;
					}
				}
			
			if (primo) 
				System.out.println("Numero "+aux+" é primo");
		
		}
		System.out.println("foi dividido "+cont+" vezes.");


		ler.close();


	}

}
