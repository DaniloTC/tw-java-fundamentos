package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");       
		int numero1 = scanner.nextInt();                      
		System.out.print("Digite a opera��o: ");
		char operacao = scanner.next().charAt(0); // charAt() pega UM char dentro de uma string pelo indice
		System.out.print("Digite o segundo n�mero: ");
		int numero2 = scanner.nextInt();
		
		/*
		 * Para este comando funcionar String.format() foi preciso configurar o Compiler compliance seguindo
		 * os seguintes passos:
		 * 
		 * Usando especificamente o Eclipse Kepler e JDK 8
		 * 
		 * (1) Bot�o direito sobre o projeto > Preferences
		 * (2) Procurar na �rea lateral esquerda a op��o Java Compiler
		 * (3) Configurar na aba "JDK Compiler" a op��o "Compiler compliance level" com a maior op��o que achar
		 * 
		 * Para esses comandos funcionarem format() e printf() ser� necess�rio configurar o compiler compliance 
		 * para uma vers�o superior a 1.6
		 * Se uma mensagem de erro aparecer nessas linhas significa que o compiler compliance est� configurado
		 * em uma vers�o inferior a 1.6
		 */
		
		// Voc� quer fazer a opera��o 9 + 2
		System.out.println(String.format("Voc� quer fazer a opera��o %d %c %d", numero1, operacao, numero2)); // usando interpola��o (visto na aula)
		System.out.printf("Voc� quer fazer a opera��o %d %c %d", numero1, operacao, numero2);                 // usando printf (j� conhecia)
		scanner.close();
	}
}