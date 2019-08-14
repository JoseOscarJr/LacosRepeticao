package ExerciciosAula2;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double paisA = 80000;
		double paisB = 200000;
		double taxaA = 1.03;
		double taxaB = 1.015;
		
		int anos = 0;
		do {
			anos++;
			paisA = paisA * taxaA;
			paisB = paisB * taxaB;
			System.out.println("população Pais A: "+ (int)paisA);
			System.out.println("população Pais B: "+ (int)paisB);
			System.out.println("Anos: "+ anos );
			
			
		}while (paisA <= paisB);
		anos = 0;
		do {
			if(anos != 0) 
				System.out.println("Erro, População A tem que ser maior que B");
			
		anos++;
		System.out.println("Informe população Pais A: ");
		paisA = entrada.nextDouble();
		System.out.println("informe população Pais B: ");
		paisB = entrada.nextDouble();
			
		}while(paisA > paisB);
		do {
			anos++;
			paisA = paisA * taxaA;
			paisB = paisB * taxaB;
			System.out.println("população Pais A: "+ (int)paisA);
			System.out.println("população Pais B: "+ (int)paisB);
			System.out.println("Anos: "+ anos );
			
			
		}while (paisA <= paisB);
		entrada.close();
	}

}
