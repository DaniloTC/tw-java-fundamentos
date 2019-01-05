package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {
	
	/*
	 * Se a variavel estiver dentro de um escopo que abrange todo o codigo que esta utilizando ela, por exemplo,
	 * o escopo do metodo main, é preciso declarar essa variavel como estatica, pois esta palavra-chave gera um
	 * local de execucao especifico e isolado para a execucao do metodo. Por este motivo quem estiver dentro de 
	 * de um escopo estatico nao acessara uma variavel definida a nivel de classe. A menor que ela seja declarada
	 * como estatica, utilizando a palavra-chave 'static' antes de sua definicao.
	 * 
	 * Esse assunto sobre escopo de variaveis, escopo de metodos e classes iremos entender melhor no curso de 
	 * Orientacao a Objetos com Java. Por ora, desta forma o codigo dentro do metodo main que usa a variavel
	 * 'resultado' deixara de apresentar erros e funcionara corretamente.
	 * 
	 * Alem disso, quando a variavel e definida a nivel de classe e nao e inicializada, nesse local ela sera
	 * inicializada automaticamente pelo Java com seu respectivo valor padrao.
	 * 
	 * OBSERVACAO
	 * 
	 * Por ora, preciso entender o seguinte:
	 * 1. As variavel definidas dentro de metodos devem ser inicializadas.
	 * 2. Se a variavel for definida a nivel de classe, observar o metodo que a usara, se e estatico ou algo
	 * com esse tipo de notacao.
	 * 3. Variaveis a niveis de classe nao precisam necessariamente ser inicializadas, pois o escopo inicializa
	 * essas variaveis automaticamente com seu respectivo valor padrao.
	 */
	static int resultado;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		System.out.print("Digite a operação [ +  -  *  / ]: ");
		char operacao = scanner.next().charAt(0);
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		if (operacao == '+') {
			resultado = numero1 + numero2; //processamento
		} else if (operacao == '-') {
			resultado = numero1 - numero2; //processamento
		} else if (operacao == '*') {
			resultado = numero1 * numero2; //processamento
		} else if (operacao == '/') {
			resultado = numero1 / numero2; //processamento
		} else {
			System.out.println("Operação inválida!"); //saída caso nenhum if acima seja verdadeiro
		}
		System.out.println(String.format("%d %c %d = %d", numero1, operacao, numero2, resultado)); // saída
		scanner.close();
	}
}