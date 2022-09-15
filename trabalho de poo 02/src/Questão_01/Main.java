package Questão_01;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1;
		float num2;
		char operador;
		float resultado;
		
		System.out.print("Digite o primeiro numero: ");
		num1 = sc.nextFloat();
		System.out.print("Digite o segundo numero: ");
		num2 = sc.nextFloat();
		System.out.print("Digite o operador: ");
		operador = sc.next().charAt(0);
		
		if(operador == '+') {
			resultado = num1 + num2;
			System.out.println("A soma dos numeros e: " + resultado);
		}
		if(operador == '-') {
			resultado = num1 - num2;
			System.out.println("A subtracao dos numeros e: " + resultado);
		}		
		if(operador == '*') {
			resultado = num1 * num2;
			System.out.println("A multiplicacao dos numeros e: " + resultado);
		}
		if(operador == '/') {
			resultado = num1 / num2;
			System.out.println("A divisão dos numeros e: " + resultado);
		}
		sc.close();

	}

}
