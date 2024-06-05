package Aula_05_06;

import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int A[] = new int [2];
		int B[] = new int [2];
		int C[] = new int [4];

		for (int i=0; i<2; i++) {
			System.out.println(" informe o " + i + " valor de A : "); 
			A[i] = ler.nextInt();
			System.out.println(" informe o " + i + " valor de B : "); 
			B[i] = ler.nextInt();
		}
		for (int i=0; i<2; i++) {
			C[i] = A [i];
			C[i+2] = B[i];
		}
		for (int i=0; i<4; i++) {
			System.out.println(" informe o " + i + " valor de C: " + C[i]);
		}
		ler.close();		
	}

}
