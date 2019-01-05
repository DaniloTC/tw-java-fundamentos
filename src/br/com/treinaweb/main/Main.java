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
		//Se a variavel 'resultado' n�o for inicializada [dentro deste escopo] o Java n�o ir� atribuir automaticamente o
		//valor padr�o por causa de quest�es de escopo e 'static' e por isso na execu��o o fluxo pode entrar no 'else'
		//e ficar sem inicializa��o, al�m disso, a IDE ir� reclamar. Portanto, quando estiver usando vari�veis dentro
		//de um escopo espec�fico � melhor inicializar a vari�vel no momento da declara��o.
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
			System.out.println("Opera��o inv�lida!"); //op��o caso nenhum processamento acima seja realizado
		}
		System.out.println(String.format("%d %c %d = %d", numero1, operacao, numero2, resultado)); // sa�da
		scanner.close();
	}
}