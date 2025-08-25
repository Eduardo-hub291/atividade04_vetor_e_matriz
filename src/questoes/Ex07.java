package questoes;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação
		// e os números.	
		
		Scanner en = new Scanner(System.in);
		
		int[] num = new int[5];
		int soma = 0;
		int mult = 1;
		
		for (int i = 0; i<5 ; i++)	{
			System.out.print("número "+(i+1)+": ");
			num[i] = en.nextInt();
			soma += num[i];
			mult = mult*num[i];
		}
		
		for (int i = 0; i<5 ; i++) {
			System.out.print(num[i]+" ");
		}
		
		System.out.println("");
		System.out.println("multiplicação: "+mult);
		System.out.print("soma: "+soma);
		
		
		en.close();
	}

}
