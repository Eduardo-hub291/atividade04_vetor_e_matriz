package questoes;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa a
		// ordem lida.
		Scanner en = new Scanner(System.in);
		
		final int X = 10;
		double[] vetor = new double[X];
		
		for (int i=0; i<=X-1; i++) {
			vetor[i] = en.nextDouble();
		}
		
		for (int i=X-1; i>=0 ; i--) {
			System.out.print(vetor[i]+" ");
		}
en.close();
	}

}
