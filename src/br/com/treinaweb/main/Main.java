package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");     // Entrada que retorna um "número" no tipo string
		int numero1 = Integer.parseInt(scanner.nextLine()); // Converte a string recebida na linha 8 para inteiro
		System.out.println(numero1);
		scanner.close();
	}
}