package Condições;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Exercicio 1
		
		int x;
		
		System.out.println("Exercicio 1 : Positivo ou Negativo");
		System.out.println("Digite um número");
		x = sc.nextInt();
		
		if (x >= 0) {
			System.out.println("Positivo");
		}
		else
			System.out.println("Negativo");
		
		
		//Exercicio 2
		
		int y;
		
		System.out.println("Exercicio 2 : Par ou Ímpar");
		System.out.println("Digite um número");
		y = sc.nextInt();
		
		
		
		if(y % 2 == 0) {
			System.out.println("Par");
		}
		else 
			System.out.println("Ímpar");
		
		//Exercicio 3
		
		int a , b;
		
		System.out.println("Exercicio 3 : Múltiplos");
		System.out.println("Digite o primeiro numero:");
		a = sc.nextInt();
		System.out.println("Digite o segundo numero:");
		b = sc.nextInt();
		
		if(a%b == 0|| b%a == 0) {
			System.out.println("Os numeros são múltiplos");
		}
		else
			System.out.println("Os numeros não são múltiplos");
		
		
	}

}
