package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// exericio DevSuperior - media_pares
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, numPar = 0;
		double mediaNumPar = 0.00;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			if(vetor[i] % 2 == 0) {
				mediaNumPar += vetor[i];
				numPar++;
			}
		}
		if(numPar > 0) {
			System.out.printf("MEDIA DOS PARES = %.1f", mediaNumPar / numPar);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		
		sc.close();
	}

}
