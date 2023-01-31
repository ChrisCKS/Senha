package Condições;

import java.util.Scanner;

public class swichcase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para o dia da semana");
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		
		
		case 1: 
			dia = "domingo";
			break;
		case 2:
			dia  ="Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6: 
			dia  = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
			
			default:
				dia = "valor inválido";
				break;
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}

}
