package br.com.treinaweb.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static int resultado;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");
		int numero1 = scanner.nextInt();
		System.out.print("Digite a opera��o [ +  -  *  / ]: ");
		char operacao = scanner.next().charAt(0);
		System.out.print("Digite o segundo n�mero: ");
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
			System.out.println("Opera��o inv�lida!"); //sa�da padr�o se nenhum 'case' acima seja verdadeiro
		}
		/*
		 * Entendendo a cria��o e funcionamento de uma collection chamada ArrayList. Essa collection precisa
		 * de componentes que est�o no pacote java.util que � o componente ArrayList. Al�m disso, a estrutura
		 * para a cria��o e adi��o de conte�do dentro de um ArrayList � feito com a estrutura abaixo.
		 */
		ArrayList<String> historico = new ArrayList<String>(); //ArrayList que guarda strings => observe: ArrayList<TIPO>
		String entradaHistorico = String.format("%d %c %d = %d", numero1, operacao, numero2, resultado); //conte�do a ser armazenado
		historico.add(entradaHistorico); //adicionando o conteudo no ArrayList
		
		System.out.println(entradaHistorico); // sa�da
		scanner.close();
	}
}