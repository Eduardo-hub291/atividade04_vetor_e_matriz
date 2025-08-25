package questoes;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		//Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os
		//números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três
		//vetores.
		Scanner en = new Scanner(System.in);
		
		
		final int N = 20;
		int[] par = new int[N];
		int[] impar = new int[N];
		int[] num = new int[N];
		int contpar = -1;
		int contimpar = -1;
		
		for (int i = 0; i<N ; i++) {
			System.out.print("insira um valor: ");
			num[i] = en.nextInt();
			if (num[i]%2==0) {
				contpar++;
				par[contpar] = num[i];
			} else {
				contimpar++;
				impar[contimpar] = num[i];
			}
		}
		
		System.out.print("todos os número: ");
		for (int i = 0; i<N ; i++) {
			System.out.print(num[i]+" ");	
		}
		
		System.out.println("");

		System.out.print("todos os número pares: ");
		for (int i = 0; i<=contpar ; i++) {
			System.out.print(par[i]+" ");	
		}
		
		System.out.println("");

		System.out.print("todos os número ímpares: ");
		for (int i = 0; i<=contimpar ; i++) {
			System.out.print(impar[i]+" ");	
		}
		
		en.close();
	}

}
