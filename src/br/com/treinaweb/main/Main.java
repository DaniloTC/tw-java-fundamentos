package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		System.out.print("Digite a operação [ +  -  *  / ]: ");
		char operacao = scanner.next().charAt(0);
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		//Se a variavel 'resultado' não for inicializada [dentro deste escopo] o Java não irá atribuir automaticamente o
		//valor padrão por causa de questões de escopo e 'static' e por isso na execução o fluxo pode entrar no 'else'
		//e ficar sem inicialização, além disso, a IDE irá reclamar. Portanto, quando estiver usando variáveis dentro
		//de um escopo específico é melhor inicializar a variável no momento da declaração.
		int resultado = 0;
		if (operacao == '+') {
			resultado = numero1 + numero2; //processamento
		} else if (operacao == '-') {
			resultado = numero1 - numero2; //processamento
		} else if (operacao == '*') {
			resultado = numero1 * numero2; //processamento
		} else if (operacao == '/') {
			resultado = numero1 / numero2; //processamento
		} else {
			System.out.println("Operação inválida!"); //opção caso nenhum processamento acima seja realizado
		}
		System.out.println(String.format("%d %c %d = %d", numero1, operacao, numero2, resultado)); // saída
		scanner.close();
	}
}