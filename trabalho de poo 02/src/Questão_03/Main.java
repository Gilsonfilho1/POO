package Questão_03;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int i;
			int qntd = 0;
			int array[];
			int maior = 0;
			Random gerar = new Random();
			
			System.out.print("Digite a quantidade de numeros: ");
			qntd = sc.nextInt();
			
			array = new int[qntd];
			
			for(i = 0; i < array.length; i++) {
				array[i] = gerar.nextInt(100);
				System.out.println(array[i]);
				if(array[i] > maior) {
					maior = array[i];
				}
				
			}
			
			System.out.println("O maior valor e: " + maior);
			
			sc.close();
		}
		

	}

}
