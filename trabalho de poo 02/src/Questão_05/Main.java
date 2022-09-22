package Questão_05;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		System.out.print("Digite o N do array: ");
		N = sc.nextInt();
		int V[] = new int[N];
		System.out.println("Insira os valores do array v: ");
		
		for(int i = 0; i < N; i++) {
			V[i] = sc.nextInt();
		}
		
		int total = 0;
		for(int i : V) {
			total += i;
		}
		
		double media = total / N;
		
		total = 0;
		
		for(int i: V) {
			total += Math.pow((i - media), 2);
		}
		
		double desvio = Math.sqrt(total/(N - 1));
		System.out.println("Media: " + media);
		System.out.println("Desvio: " + desvio);
		
		
		sc.close();

	}

}
