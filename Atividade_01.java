package Aula_05_06;

import java.util.Scanner;

public class Atividade_01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int fat= 1, num;

		System.out.print("informe o fatorial :");
		num = ler.nextInt();

		if (num < 0) {
			System.out.print("Não existe fatorial de numero negativo!");	
			// System.exit(0); dai não tem necessidade do if (num <= 0) pois ja encera o comando no 0
		}
		if (num >= 0) {
			for (int i = 1; i <= num; i++) {
				fat *= i;
			}
			System.out.println(" o fatorial de " + num + " é :" + fat); 
		}
		ler.close();
	}
}
