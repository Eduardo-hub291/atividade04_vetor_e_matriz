package questoes;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/*Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no
		seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida. Mostrar
		também idade e altura do mais velho, mais novo, mais baixo e mais alto. Mostrar idade e
		altura de quem está abaixo e acima da média de idade e altura;*/
	Scanner en = new Scanner(System.in);
	
	// vetor idade e vetor altura
	final int X=5;
	int[] idade = new int[X];
	double[] altura = new double[X];
	
	// alto, baixo, velho e novo + contardor 2 media
	int velho, novo, alto, baixo;

	
	// lê o primeiro valor
	System.out.print("altura da 1° pessoa: ");
	altura[0] = en.nextDouble();
	System.out.print("Idade da 1° pessoa: ");
	idade[0] = en.nextInt();
	alto = 0;
	baixo = 0;	
	velho = 0;
	novo = 0;
	int mIdade = idade[0];
	double mAltura = altura[0];
	
	// for + if para definir as variáveis
	for (int i = 1; i<X; i++) {
		System.out.print("altura da "+(i+1)+"° pessoa: ");
		altura[i] = en.nextDouble();
		System.out.print("Idade da "+(i+1)+"° pessoa: ");
		idade[i] = en.nextInt();
		mIdade += idade[i];
		mAltura += altura[i];
		if (altura[i]>altura[alto]) {
			alto = i;
		} else if (altura[i]<altura[baixo]) {
			baixo = i;
		}
		if (idade[i]>idade[velho]) {
			velho = i;
		} else if (idade[i]<idade[novo]) {
			novo = i;
		}
	}
	
	
	// for invertdo para imprimir
	
	System.out.println("");


	System.out.println("idade invertida da ordem lida: ");
	for (int i = X-1; i>=0; i--) {
		System.out.print(idade[i]+" ");
	}
	
	System.out.println("");
	System.out.println("");


	
	System.out.println("altura invertida da ordem lida: ");	
	for (int i = X-1; i>=0; i--) {
		System.out.print(altura[i]+" ");
	}
	
	System.out.println("");
	System.out.println("");


	
	// printlns para os mais e menos alguma coisa
	
	System.out.println("idade e altura do mais velho: "+ idade[velho] +" "+ altura[velho]);	
	System.out.println("idade e altura do mais novo: "+ idade[novo] +" "+ altura[novo]);
	System.out.println("idade e altura do mais alto: "+ idade[alto] +" "+ altura[alto]);
	System.out.println("idade e altura do mais baixo: "+ idade[baixo] +" "+ altura[baixo]);
	
	System.out.println("");

	System.out.println("média de altura: "+ mAltura/X);
	System.out.println("média de idade: "+ mIdade/X);
	System.out.println("");

	// 2 for + if para ver quem está acima das médias
	System.out.println("Idade e altura de quem está acima da média de altura: ");	
	for (int i = 0; i<X; i++) {
		if (altura[i] > mAltura/X) {
			System.out.println(idade[i] +" "+ altura[i]);	
		}
	}
	
	System.out.println("");

	
	System.out.println("Idade e altura de quem está acima da média de idade: ");	
	for (int i = 0; i<X; i++) {
		if (idade[i] > mIdade/X) {
			System.out.println(idade[i] +" "+ altura[i]);	
		}
	}
	

	System.out.println("");

	// 2 for + if para ver quem está abaixo das médias
	
	

	System.out.println("Idade e altura de quem está abaxio da média de altura: ");	
	for (int i = 0; i<X; i++) {
		if (altura[i] < mAltura/X) {
			System.out.println(idade[i] +" "+ altura[i]);	
		}
	}

	System.out.println("");
	
	System.out.println("Idade e altura de quem está abaxio da média de idade: ");	
	for (int i = 0; i<X; i++) {
		if (idade[i] < mIdade/X) {
			System.out.println(idade[i] +" "+ altura[i]);	
		}
	}
	
	System.out.println("");
	
	en.close();
	}

}
