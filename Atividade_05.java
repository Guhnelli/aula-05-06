package Aula_05_06;

import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int A [][] = new int [3] [3];
		int B [][] = new int [3] [3];
		int C [][] = new int [3] [3];

		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				A [i][j] = (int)Math.round(Math.random()*10);
				B [i][j] = (int)Math.round(Math.random()*10);
				C [i][j] = A [i][j]*B [i][j];		
			}
		}
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("os valores da matriz C são na posição" + " | " + i + j + " |  + é " + C[i][j]); 
			}
		}
	}
}
