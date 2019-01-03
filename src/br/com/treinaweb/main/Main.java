package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu Nome: ");
		String nome = scanner.next();
		System.out.println(nome);
		// Desconectar a variável 'scanner' do stream de entrada
		// do sistema para eliminar o warning da linha 7. Já que
		// não irei mais usar a entrada de dados com Scanner.
		scanner.close();
	}
}