package listaRepeticao37Exer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		final int TAM = 50;
		double soma = 0;
		
		for (int i = 0; i < TAM; i++) {
			soma += 1.99;
			System.out.println((i+1)+" - R$ "+ df.format(soma));
		}
		ler.close();

	}

}
