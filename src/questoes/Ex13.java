package questoes;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[20];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = en.nextInt();
        }

        System.out.println("Digite outros 10 números:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = en.nextInt();
        }

        int pos = 0;
        for (int i = 0; i < 10; i++) {
            vetor3[pos] = vetor1[i];
            pos++;
            vetor3[pos] = vetor2[i];
            pos++;
        }

        System.out.println("Vetor intercalado:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor3[i] + " ");
        }

        en.close();
	}

}
