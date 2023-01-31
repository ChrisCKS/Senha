package Condições;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Exemplo 1");
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		if(hora<= 12) {
			System.out.println("Bom dia");
	}
		else if(hora<=18) {
			System.out.println("Boa tarde");
		}
		else 
			System.out.println("Boa noite");
		
		
		//outro modo
		System.out.println("Exemplo 2");
		
		System.out.println("Digite o valor do produto");
		
		double valor = sc.nextInt();
		double desconto = (valor < 30.0) ? valor * 0.1 : valor * 0.05;
		double resultado = valor - desconto;
		
		System.out.printf("Desconto de : %.2f%n" , desconto);
		System.out.printf("Valor á pagar : %.2f%n" , resultado);	
		sc.close();
		
}
	
}

