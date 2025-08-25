package questoes;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	// 1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
	Scanner en = new Scanner(System.in); 
		final int X = 5;
		int[] vetor=new int[X];
		
		for (int i=0; i<=X-1; i++) {
			vetor[i] = en.nextInt();
		}
		
		for (int i=0 ; i<=X-1; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		en.close();

	}

}
