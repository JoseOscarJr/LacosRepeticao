package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("informe quantas pessoas: ");
		int num = ler.nextInt();
		double soma = 0;
		double nota = 0;
		for (int i = 0; i < num; i++) {
			System.out.print("Informe as idades: ");
			nota = ler.nextDouble();
			
			soma += nota;
		}
		
		double media =(soma/num);
		if(media > 0 && media <= 25) {
			System.out.println("turma jovem ");
		}else if(media >= 26 && media <= 60) {
			System.out.println("turma adulta ");
		}else if(media > 60) {
			System.out.println("turma velha ");
		}
		
		ler.close();



	}

}
