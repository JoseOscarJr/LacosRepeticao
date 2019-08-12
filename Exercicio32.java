package listaRepeticao37Exer;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 5;
		int[] cod = new int[TAM];
		int[] veiculos = new int[TAM];
		int[] acidente = new int[TAM];
		int indiceAcidenteMenor = 0;
		int indiceAcidenteMaior = 0;
		int mediaVeiculos = 0;
		int cont = 0;
		int mediaAcidentes = 0;
		int ind1 = 0;
		int ind2 = 0;
		for (int i = 0; i < TAM; i++) {
			System.out.print("Informe o codigo da cidade: ");
			cod[i] = ler.nextInt();
			System.out.print("Informe o numero de veiculos: ");
			veiculos[i] = ler.nextInt();
			System.out.print("Informe o numero de acidentes com vitimas: ");
			acidente[i] = ler.nextInt();
			
		}
		indiceAcidenteMaior = acidente[0];
		indiceAcidenteMenor = acidente[0];
		
		for (int i = 0; i < TAM; i++) {
			if (acidente[i] < indiceAcidenteMenor) {
				indiceAcidenteMenor = acidente[i];
				ind1 = i;
			} else if (acidente[i] > indiceAcidenteMaior) {
				indiceAcidenteMaior = acidente[i];
				ind2 = i;
			}
			mediaVeiculos += veiculos[i];
			if(veiculos[i] <= 2000) {
				mediaAcidentes += acidente[i];
				cont++;
			}
		}
		System.out.println("Maior indice de acidente é da cidade "+cod[ind1]+" com "+indiceAcidenteMaior+" acidentes");
		System.out.println("Menor indice de acidente é da cidade "+cod[ind2]+" com "+indiceAcidenteMenor+" acidentes");
		System.out.println("Media de veiculos das cinco cidades "+(mediaVeiculos/TAM));
		System.out.println("Media de acidentes de transitos nas cidade com menos de 2000 veiculos: "+ (mediaAcidentes/cont));
	}

}
