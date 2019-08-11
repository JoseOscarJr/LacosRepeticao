package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("informe quantas turmas: ");
		int num = ler.nextInt();
		int soma = 0;
		
		for (int i = 0; i < num; i++) {
			int turma;
		
			do {
				System.out.print("Informe numero de alunos da turma " + (i+1) +" :");
				turma = ler.nextInt();
				
			}while(turma > 40);
			
			soma+= turma;
				
		}
		System.out.println("media de alunos por turma "+ (soma/num));
		ler.close();
	}

}
