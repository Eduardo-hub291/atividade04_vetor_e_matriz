package questoes;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
//		Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que determine quantos
//		alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.
	
	      final int X = 30;

	        int[] idades = new int[X];
	        double[] alturas = new double[X];

	        Scanner en = new Scanner(System.in);

	        for (int i = 0; i < X; i++) {
	            System.out.print("Idade do aluno " + (i+1) + ": ");
	            idades[i] = en.nextInt();

	            System.out.print("Altura do aluno " + (i+1) + ": ");
	            alturas[i] = en.nextDouble();
	        }

	        double somaAlturas = 0;
	        for (int i = 0; i < X; i++) {
	            somaAlturas += alturas[i];
	        }

	        double mediaAltura = somaAlturas / X;

	        int contador = 0;
	        for (int i = 0; i < X; i++) {
	            if (idades[i] > 13 && alturas[i] < mediaAltura) {
	                contador++;
	            }
	        }

	        System.out.println("Quantidade de alunos com mais de 13 anos e altura abaixo da média: " + contador);

	        en.close();
	
	}

}
