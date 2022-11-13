package teste;
import empresa.*;
import java.util.GregorianCalendar; 

public class App {

	public static void main(String[] args) {
		
		GregorianCalendar dataNascimento1 = new GregorianCalendar();
		GregorianCalendar dataNascimento2 = new GregorianCalendar();
		GregorianCalendar dataDeAdmissao = new GregorianCalendar();
		
		dataNascimento1.set(2004, 05, 25);
		dataNascimento2.set(2003, 06, 21);
		dataDeAdmissao.set(2022, 11, 31);
		
		Funcionario funcionario1 = new Funcionario("111.111.111-11", "Luis", 'M', 3900, dataNascimento1, dataDeAdmissao);
		Funcionario funcionario2 = new Funcionario("222.222.222-22", "Luisa", 'F', 2200, dataNascimento2, dataDeAdmissao);
		Funcionario[] funcionarios = new Funcionario[2];
		funcionarios[0] = funcionario1;
		funcionarios[1] = funcionario2;
		
		OperacaoFuncionario opFuncion = new OperacaoFuncionario();
		
		opFuncion.ValidateEmployees(funcionarios);
		opFuncion.SexoCounter(funcionarios);
		opFuncion.OldestAndYoungestEmployee(funcionarios);
		

	}

}
