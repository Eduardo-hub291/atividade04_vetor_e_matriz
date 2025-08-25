package questoes;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
		
		Scanner en = new Scanner(System.in);
		final int X = 4;
		double[] notas = new double[X];
		double media = 0;
		
		for (int i=0; i<X; i++) {
			System.out.print("nota "+(i+1)+": ");
			notas[i] = en.nextDouble();
			media += notas[i];
		}

		System.out.print("notas: ");
		for (int i=0; i<X; i++) {
			System.out.print(notas[i] + " / ");
		}
		System.out.println("média: "+ media/X);
	en.close();
	}
	

}
