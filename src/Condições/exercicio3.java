package Condições;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x , z;
		int y = 3;
		
		System.out.println("Crie sua senha: ");
		x = sc.nextInt();
		z = x;
		
		System.out.println("Senha criada com sucesso");
		System.out.println("Digite sua senha: ");
		x = sc.nextInt();
		
		while(z!=x && y >= 1) {
			System.out.printf("Senha incorreta, você tem %s tentativas restantes%n" , y);
			y = y -1;
			System.out.println("Digte a senha novamente: ");
			x = sc.nextInt();
			}
			if (y<1) {
				System.out.println("Limite de tentativas excedido, acesso bloqueado");
			}
			else
				System.out.println("Senha correta, acesso liberado");
		
		sc.close();
	}
	

}
	
