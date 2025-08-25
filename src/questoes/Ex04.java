package questoes;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram
		// lidas. Imprima as consoantes.
	Scanner en = new Scanner(System.in);
	
	final int X = 10;
	String caract = "";
	int cont = 0;
	String nvogal = "";
	for (int i = 0; i<X; i++) {
		caract = en.nextLine();
		if (!caract.equalsIgnoreCase("a") && !caract.equalsIgnoreCase("E") && !caract.equalsIgnoreCase("I") && !caract.equalsIgnoreCase("O") && !caract.equalsIgnoreCase("U")) {
			cont++;
			nvogal += caract;
		}
	}
	System.out.println("as consoantes foram: "+nvogal);
	System.out.print("quantidade de consoantes foram: "+ cont);
	
	en.close();
	}

}
