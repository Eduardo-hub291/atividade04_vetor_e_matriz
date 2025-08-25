package questoes;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
//		Faça um programa que tenha como entrada várias palavras separadas por ;
//		(rodrigo;curvello;antonio;....) separe as palavras e coloque cada uma em uma posição do
//		vetor
	
		Scanner en=new Scanner(System.in);
		
		System.out.print("insira um número de palavras separadas por ';': ");
		String palavras = en.nextLine();
		
		int cont = 0;
		
		for (int i = 0; i< palavras.length(); i++) {
			
			if ((palavras.charAt(i)) == ';') {
				cont ++;
			} 
		}
		
		String[] nomes = new String[cont];
		int[] inicio = new int[cont];
		int[] fim = new int[cont];
		inicio[0]=0;
		fim[0]=0;
		
		for (int x = 0 ; x<cont ; x++) {
			if (x==0) {
				for (int i = fim[x]+1; i< palavras.length(); i++) {
					if ((palavras.charAt(i)) == ';') {
					nomes[x] = palavras.substring(0,i);
					fim[x] = i;
					break;		
					}
				}
			} else {
			for (int i = fim[x-1]+1; i< palavras.length(); i++) {
				if ((palavras.charAt(i)) == ';') {

					inicio[x] = (fim[x-1] + 1);
					fim[x] = i;
					nomes[x] = palavras.substring(inicio[x],fim[x]);
					break;
					}
				}
			} 	
		}
			
		
		for (int i = 0; i<cont; i++) {
			System.out.println(nomes[i]);
		}
				
		en.close();
	}

}
