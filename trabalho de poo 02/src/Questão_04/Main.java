package Questão_04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String digitar_senha;
		int i;
		

		
		
		for(i = 0; i < 1;) {
			System.out.print("Digite uma senha: ");
			digitar_senha = sc.next();
			
			if(digitar_senha.equals ("a76dk09")) {
				i++;
				System.out.println("Parabens voce acertou a senha");
			}else {
				System.out.println("Senha incorreta!");
				
			}
		}
		
		
		
		sc.close();
		

	}

}
