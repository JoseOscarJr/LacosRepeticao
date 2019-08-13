package listaRepeticao37Exer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double valor = 0;
		
		System.out.print("Informe o valor da divida: ");
		valor = ler.nextDouble();
		double juros = 1.10;
		System.out.println("Valor da Dívida Valor dos Juros Quantidade de Parcelas Valor da Parcela");
		for (int i = 0; i < 13; i+=3) {
			if(i != 0) {
			System.out.println("R$ "+df.format((valor*juros))+"      "+(int)(juros*100)+"          "+i+"                      R$ "+df.format((valor * juros)/i));
			juros += 0.05;
			}else {
				System.out.println("R$ "+df.format((valor))+"      0            "+i+"                      R$ "+valor);
			}
		}
		ler.close();

	}

}
