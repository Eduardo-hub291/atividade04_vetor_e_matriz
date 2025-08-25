package questoes;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		
		/* Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a
			média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.*/
					
		final int N = 10;
		double media = 0;
		double[] nota = new double[4];
		int cont = 0;
		
		for (int i = 0; i<N ; i++) {
			System.out.print("insira as 4 notas do aluno "+(i+1)+": ");
			for (int x = 0; x<4 ; x++) {
				nota[x] = en.nextDouble();
				media += nota[x];
			}
			if (media/N >= 7) {
				cont++;
			}
			
		}
		
		System.out.print("o número de alunos com média igual ou acima de 7 é "+cont);
		
		
		en.close();
		
		
	}
}
