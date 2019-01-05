package br.com.treinaweb.main;

import java.util.ArrayList;
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
		/*
		 * Entendendo a criação e funcionamento de uma collection chamada ArrayList. Essa collection precisa
		 * de componentes que estão no pacote java.util que é o componente ArrayList. Além disso, a estrutura
		 * para a criação e adição de conteúdo dentro de um ArrayList é feito com a estrutura abaixo.
		 */
		ArrayList<String> historico = new ArrayList<String>(); //ArrayList que guarda strings => observe: ArrayList<TIPO>
		String entradaHistorico = String.format("%d %c %d = %d", numero1, operacao, numero2, resultado); //conteúdo a ser armazenado
		historico.add(entradaHistorico); //adicionando o conteudo no ArrayList
		
		System.out.println(entradaHistorico); // saída
		scanner.close();
	}
}