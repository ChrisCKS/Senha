package Condições;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double conta = 50.0;
		
		System.out.println("O plano de telefone oferece 100 minutos por 50 R$ por mês e um acréscimo de 2 R$ para cada minuto excedido");
		System.out.println("Digite quantos minutos foram usados");
		minutos = sc.nextInt();
		
		if(minutos > 100) {
			conta = conta + (minutos - 100) * 2.0;
			
		}
			System.out.printf("Valor: %.2f" , conta);	
		sc.close();
	}

}
