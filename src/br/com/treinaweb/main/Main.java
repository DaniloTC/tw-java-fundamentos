package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");       
		int numero1 = scanner.nextInt();                      
		System.out.print("Digite a operação: ");
		char operacao = scanner.next().charAt(0); // charAt() pega UM char dentro de uma string pelo indice
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		
		/*
		 * Para este comando funcionar String.format() foi preciso configurar o Compiler compliance seguindo
		 * os seguintes passos:
		 * 
		 * Usando especificamente o Eclipse Kepler e JDK 8
		 * 
		 * (1) Botão direito sobre o projeto > Preferences
		 * (2) Procurar na área lateral esquerda a opção Java Compiler
		 * (3) Configurar na aba "JDK Compiler" a opção "Compiler compliance level" com a maior opção que achar
		 * 
		 * Para esses comandos funcionarem format() e printf() será necessário configurar o compiler compliance 
		 * para uma versão superior a 1.6
		 * Se uma mensagem de erro aparecer nessas linhas significa que o compiler compliance está configurado
		 * em uma versão inferior a 1.6
		 */
		
		// Você quer fazer a operação 9 + 2
		System.out.println(String.format("Você quer fazer a operação %d %c %d", numero1, operacao, numero2)); // usando interpolação (visto na aula)
		System.out.printf("Você quer fazer a operação %d %c %d", numero1, operacao, numero2);                 // usando printf (já conhecia)
		scanner.close();
	}
}