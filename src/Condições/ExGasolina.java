package Condições;

import java.util.Scanner;

public class ExGasolina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		double y , z;
		
		System.out.println("1 - Gasolina / 6 R$");
		System.out.println("2 - Alcool / 5 R$");
		System.out.println("3 - Diesel / 4 R$");
		
		System.out.println("Digite qual será o combustível: ");
		x = sc.nextInt();
		
		while(x > 4) {
			System.out.println("Codigo inválido, tente novamente");
			System.out.println("Digite qual será o combustível: ");
			x = sc.nextInt();
		}
		if( x == 1) {
			System.out.println("Ok, gasolina");
			System.out.println("Digite o valor");
			y = sc.nextDouble();
			System.out.printf("Serão %.2f reais de gasolina%n" , y);
			z = y / 6;
			System.out.printf("Quantidade: %.2f Litros%n" , z);
		}
			else if ( x == 2) {
			System.out.println("Ok, alcool");
			System.out.println("Digite o valor");
			y = sc.nextDouble();
			System.out.printf("Serão %.2f reais de alcool%n" , y);
			z = y / 5;
			System.out.printf("Quantidade: %.2f Litros%n" , z);
			}
				else if( x == 3) {
					System.out.println("Ok, diesel");
					System.out.println("Digite o valor");
					y = sc.nextDouble();
					System.out.printf("Serão %.2f reais de diesel%n" , y);
					z = y / 4;
					System.out.printf("Quantidade: %.2f Litros%n" , z);
				}
		else
			System.out.println("Fim");
		
	}
}
	

