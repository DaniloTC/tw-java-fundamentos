package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Digite a mensagem1 (nextLine): ");
//		String mensagem1 = scanner.nextLine();                    // nextLine() considera "ENTER" o fim do comando
//		System.out.print("Digite a mensagem2 (next): ");
//		String mensagem2 = scanner.next();                        // next() considera o primeiro espaço " " o fim do comando
//		System.out.println("Mensagem1 (nextLine): " + mensagem1); // mensagem completa antes do "Enter"
//		System.out.println("Mensagem2 (next)    : " + mensagem2); // mensagem completa antes do primeiro espaço
		
		System.out.print("Digite o primeiro número: ");       
		//int numero1 = Integer.parseInt(scanner.nextLine()); 
		int numero1 = scanner.nextInt();                      
		System.out.print("Digite a operação: ");
		char operacao = scanner.next().charAt(0); // charAt() pega um char dentro de uma string pelo indice
		scanner.close();
	}
}