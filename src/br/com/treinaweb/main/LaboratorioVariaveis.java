package br.com.treinaweb.main;

public class LaboratorioVariaveis {

	public static void main(String[] args) {
		
		String nome = "Danilo Castro";
		String dataNascimento = "25/10/1987";
		String rg = "12.1234.4567.78";
		char sexo = 'M';
		double salario = 954.00;
		
		/*
	  	   Codigo 	Significado
		   %d 	    Inteiro
		   %f 	    Float
		   %c 	    Caractere
		   %s 	    String
		   %% 	    Coloca na tela um %
		*/
		
		// Impressao 1 - usando  println e concatenacao
		System.out.println("O senhor "+nome+", portador do RG de numero "+rg+", nascido em "+dataNascimento+", do sexo "+sexo+", está registrado com o salário de R$ "+salario);
		
		// Impressao 2 - formatando com interpolação e utilizando a funcao format do objeto String
		System.out.println(String.format("O senhor %s, portador do RG de numero %s, nascido em %s, do sexo %c, está registrado com o salario de R$ %.2f", nome, rg, dataNascimento, sexo, salario));
		
		// Impressao 3 - formatando com printf
		System.out.printf("O senhor %s, portador do RG de numero %s, nascido em %s, do sexo %c, está registrado com o salário de R$ %f", nome, rg, dataNascimento, sexo, salario);
	}
}
