package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");
		int numero1 = scanner.nextInt();
		System.out.print("Digite a opera��o [ +  -  *  / ]: ");
		char operacao = scanner.next().charAt(0);
		System.out.print("Digite o segundo n�mero: ");
		int numero2 = scanner.nextInt();
		//Se a variavel 'resultado' n�o for inicializada ser� atribuido como padr�o o valor '0', mas na execu��o 
		//o fluxo pode entrar no 'else' e ficar sem inicializa��o, com isso, o eclipse ir� reclamar. Portanto, �
		//melhor inicializar uma vari�vel no momento da declara��o.
		int resultado = 0;
		if (operacao == '+') {
			resultado = numero1 + numero2; //processamento
			System.out.println(String.format("%d %c %d = %d", numero1, operacao, numero2, resultado)); //sa�da
		} else if (operacao == '-') {
			resultado = numero1 - numero2; //processamento
			System.out.println(String.format("%d %c %d = %d", numero1, operacao, numero2, resultado)); //sa�da
		} else if (operacao == '*') {
			resultado = numero1 * numero2; //processamento
			System.out.println(String.format("%d %c %d = %d", numero1, operacao, numero2, resultado)); //sa�da
		} else if (operacao == '/') {
			resultado = numero1 / numero2; //processamento
			System.out.println(String.format("%d %c %d = %d", numero1, operacao, numero2, resultado)); //sa�da
		} else {
			System.out.println("Opera��o inv�lida!"); //op��o caso nenhum processamento acima seja realizado
		}
		scanner.close();
	}
}