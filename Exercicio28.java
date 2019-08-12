package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int cont =0;
		double temp = 0;
		double maiorTemp = 0;
		double menorTemp = 0;
		double Media = 0;
		String opSair = " ";
		do {
			System.out.print("Informe uma temperatura: ");
			 temp = ler.nextDouble();
			if(cont == 0) {
				maiorTemp = temp;
				menorTemp = temp;
			}else if(maiorTemp < temp) {
				maiorTemp = temp;
			}else if(menorTemp > temp) {
				menorTemp = temp;
			}
			Media += temp;
			cont++;
			System.out.print("Informa mais temperatura? s/n");
			opSair = ler.next();
			
		}while(opSair.equalsIgnoreCase("s"));
		System.out.println("Maior temperatura "+maiorTemp+"°C");
		System.out.println("Maior temperatura "+menorTemp+"°C");
		System.out.println("Temperatura Media "+(Media/cont)+"°C");
		
		ler.close();

	}

}
