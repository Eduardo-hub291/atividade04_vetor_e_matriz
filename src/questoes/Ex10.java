package questoes;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// Faça um programa que peça uma data no padrão dd/mm/aaaa, valide esta data e coloque
		// cada item em uma posição de um vetor de inteiros de tamanho 3.
		Scanner en = new Scanner(System.in);
		
		int[] data = new int[3];
		
		System.out.print("dia: ");
		data[0] = en.nextInt();
		System.out.print("mês: ");
		data[1] = en.nextInt();
		System.out.print("ano: ");
		data[2] = en.nextInt();

		System.out.println("");
		System.out.print(data[0] +"/"+data[1]+"/"+data[2]);
		
		en.close();
	}

}
