package Questão_06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inputar = new Scanner(System.in);
		int[] numeros = {9,9,9,9};

		while (!(numeros[0] == 0 && numeros[1] == 0 && numeros[2] == 0 && numeros[3] == 0))
		{
			String entradas = inputar.nextLine();
			try {
				
				String[] values = entradas.split(" "); 
				for (int i = 0; i < values.length; i++) {
					numeros[i] = Integer.parseInt(values[i]); 
				}
				
				if((numeros[0] < 0 || numeros[0] > 23) || (numeros[1] < 0 || numeros[1] > 59) ||(numeros[2] < 0 || numeros[2] > 23) || (numeros[3] < 0 || numeros[3] > 59) )
				{
					throw new Exception();
				}
				System.out.println(countminutos(numeros));
			}
			catch (Exception e) {
				System.out.println("Ocorreu um Erro com os Valores");
			}
		}
		inputar.close();
	}
	public static int countminutos(int[] numeros)
	{
		int horas = 0;
		int minutos = 0;
		if(numeros[0] < numeros[2] )
		{
			if(numeros[1] <= numeros[3])
			{
				horas = numeros[2] - numeros[0];
				minutos = numeros[3] - numeros[1];
			}
			else
			{
				horas = numeros[2] - numeros[0] - 1;
				minutos = (60 - numeros[1]) + numeros[3];
			}
		}
		else if(numeros[0] == numeros[2])
		{
			if(numeros[1] <= numeros[3])
			{
				horas = 0;
				minutos = numeros[3] - numeros[1];
			}else {
				horas = 23;
				minutos = (60 - numeros[1]) + numeros[3];
			}
		}
		else {
			if(numeros[1] <= numeros[3])
			{
				horas = (24 -  numeros[0]) + numeros[2];
				minutos = numeros[3] - numeros[1];
			}else
			{
				horas = (24 -  numeros[0]) + numeros[2] - 1; 
				minutos = (60 - numeros[1]) + numeros[3];
			}
		}
		minutos += horas * 60;
		return minutos;

	}

}
