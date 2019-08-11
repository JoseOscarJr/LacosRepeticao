package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double aux1 =1;
		double aux2 =1;
		double soma =0;
		System.out.print("ate qual numero fazer? ");
		int valor = ler.nextInt();
		System.out.print("S = ");
		for (int i = 0; i < valor; i++) {

			soma = soma+(aux1/aux2);
			aux1++;
			aux2+=2;
			if(i == (valor - 1)){
				System.out.print(aux1+"/"+aux2);
			}else {	
				System.out.print(aux1+"/"+aux2 +" +");
			}
		}
		System.out.println(" = "+ soma);
		ler.close();

	}

}
