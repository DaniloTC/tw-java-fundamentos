package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {
	
	static int resultado;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		System.out.print("Digite a operação [ +  -  *  / ]: ");
		char operacao = scanner.next().charAt(0);
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		switch (operacao) {
		case '+':
			resultado = numero1 + numero2; //processamento
			break;
		case '-':
			resultado = numero1 - numero2; //processamento
			break;
		case '*':
			resultado = numero1 * numero2; //processamento
			break;
		case '/':
			resultado = numero1 / numero2; //processamento
			break;
		default:
			System.out.println("Operação inválida!"); //saída padrão se nenhum 'case' acima seja verdadeiro
		}
		System.out.println(String.format("%d %c %d = %d", numero1, operacao, numero2, resultado)); // saída
		scanner.close();
	}
}