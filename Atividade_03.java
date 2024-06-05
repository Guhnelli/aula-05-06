package Aula_05_06;

import java.util.Scanner;

public class Atividade_03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int senha_mestra, senha_tentativa;
		double valor01, valor02, soma=0;

		System.out.print("cadatre uma senha (apenas numeroa): ");
		senha_mestra = ler.nextInt();

		System.out.print(" Digite sua senha para desbloquear a soma:");
		senha_tentativa = ler.nextInt();

		System.out.print("informe o 1° numero :");
		valor01 = ler.nextDouble();

		System.out.print("informe o 2° numero :");
		valor02 = ler.nextDouble();

		soma = (valor01+valor02);

		String notificaçao = (senha_mestra == senha_tentativa)? "A soma é: " + soma : "Erro ! senha errada";
		System.out.print(notificaçao);

		ler.close();
	}

}


