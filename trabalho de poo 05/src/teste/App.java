package teste;

import java.util.GregorianCalendar;
import java.util.Scanner;

import empresa.Analista;
import empresa.Funcionario;
import empresa.Gerente;
import empresa.OperacaoFuncionario;
import empresa.Programador;

public class App {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		String[] linguagens = new String[5];
		String[] diagramas = new String[5];
		String[] metodologiaDesenvolvimento = new String[5];
		
		Funcionario[] func = new Funcionario[6];
		
		func[0] = new Programador("123.123.123-23", "Luis", 'X', 1231, new GregorianCalendar(1940, 01, 01),
				new GregorianCalendar(2000, 10, 12), linguagens);
		
		func[1] = new Programador("111.123.123-23", "Luisa", 'M', 1231, new GregorianCalendar(1941, 02, 02),
				new GregorianCalendar(2000, 10, 12), linguagens);
		
		func[2] = new Analista("111111111-23", "Carla", 'F', 2231, new GregorianCalendar(1942, 03, 03),
				new GregorianCalendar(2000, 10, 12), diagramas);
		
		func[3] = new Analista("123.123.123-23", "Carlos", 'M', 1231, new GregorianCalendar(1943, 04, 04),
				new GregorianCalendar(2000, 10, 12), diagramas);
		
		func[4] = new Gerente("144.141.444-23", "Nicolas", 'M', 1231, new GregorianCalendar(1944, 05, 05),
				new GregorianCalendar(2000, 10, 12), metodologiaDesenvolvimento);
		
		func[5] = new Gerente("1101212-23", "Nicole", 'F', 2231, new GregorianCalendar(1945, 06, 06),
				new GregorianCalendar(2000, 10, 12), metodologiaDesenvolvimento);
		
		OperacaoFuncionario.FuncionariosValidosEInvalidos(func);
		OperacaoFuncionario.FuncionariosDeCadaSexo(func);
		OperacaoFuncionario.FuncionarioMaisVelhoeMaisNovo(func);
		
		s.close();
	}

}
