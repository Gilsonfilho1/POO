package Questão_02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int i;
			int qntd;
			int array[];
			int par = 0;
			int impar = 0;
			int positivo = 0;
			int negativo = 0;
			int neutro = 0;
			
			System.out.print("Digite a quantidade de numeros: ");
			qntd = sc.nextInt();
			
			array = new int[qntd];
			
			for(i = 0; i < array.length; i++) {
				System.out.format("Digite o numero %d: ", i + 1);
				array[i] = sc.nextInt();
				
				if(array[i] == 0) {
					neutro++;
				}else if(array[i] % 2 == 0) {
					par++;
				}else {
					impar++;
				}
				if(array[i] > 0) {
					positivo++;
				}else if (array[i] < 0){
					negativo++;
				}
			}
			
			System.out.println("Impares:" + impar +" Pares:" + par + " Neutros:" + neutro + " Positivos:" + positivo + " Negativos:" + negativo);
			
			sc.close();
		}

	}

}
