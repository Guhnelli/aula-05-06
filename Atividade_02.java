package Aula_05_06;

import java.util.Scanner;

public class Atividade_02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		double valor;

		System.out.print("informe o valor :");
		valor = ler.nextDouble();

		if(valor % 5 == 0) {
			System.out.print("o numero " + valor + " é multiplo de 5");
		}
		if (valor % 5 != 0)	{
			System.out.print("o numero " + valor + " não é multiplo de 5");	

		}
		ler.close();
	}
}



