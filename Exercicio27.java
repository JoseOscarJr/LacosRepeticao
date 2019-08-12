package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opInicial = 1;
		int cont = 1;
		double soma = 0;
		double produto = 0;
		double dinheiro = 0;
		do {
			cont = 1;
			soma = 0;
			dinheiro = 0;
			produto = 0;
			System.out.println("Lojas Tabajara ");
			do {
				System.out.print("Produto "+cont+" : R$ ");
				produto =ler.nextDouble();
				soma += produto;
				cont++;
			} while (produto != 0);
	
			System.out.println("Total: R$"+soma);
			
			System.out.print("Informe o valor do dinheiro: R$ ");
			dinheiro = ler.nextDouble();
			
			System.out.println("Dinheiro: R$"+dinheiro);
			System.out.println("Troco: R$"+(dinheiro-soma));
			
			System.out.println("\n\nDeseja fechar programa? 0 para sair"
					+ "\nDeseja continuar digite 1 ");
			opInicial = ler.nextInt();
			
		}while(opInicial != 0);
		System.out.println("Tenha um bom descanso!!");
		ler.close();


	}

}
