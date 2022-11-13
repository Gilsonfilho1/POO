package empresa;

import java.util.ArrayList;

public class OperacaoFuncionario {

	public static void ValidateEmployees(Funcionario[] funcionarios) {
		ArrayList<Funcionario> valid = new ArrayList<Funcionario>();
		ArrayList<Funcionario> invalid = new ArrayList<Funcionario>();

		for (Funcionario funcionario : funcionarios) {
			if (funcionario.ValidateCPF() && funcionario.ValidateDataDeAdmissao() && funcionario.ValidateBirthDate()
					&& (funcionario.getSexo() == 'M' || funcionario.getSexo() == 'F'))
				valid.add(funcionario);
			else {
				invalid.add(funcionario);
			}
		}

		System.out.println("Funcion�rios v�lidos: " + valid.size());
		for (Funcionario funcionario : valid) {
			System.out.println(funcionario.toString());
		}

		System.out.println("\nFuncion�rios inv�lidos: " + invalid.size());
		for (Funcionario funcionario : invalid) {
			System.out.println(funcionario.toString() + "\n");
		}
	}

	public static void SexoCounter(Funcionario[] funcionarios) {
		int male = 0;
		int female = 0;

		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getSexo() == 'M')
				male++;
			else if (funcionario.getSexo() == 'F')
				female++;
		}

		System.out.println("Funcion�rios masculinos: " + male + "\nFuncion�rios femininos: " + female);
	}

	public static void OldestAndYoungestEmployee(Funcionario[] funcionarios) {
		Funcionario oldest = funcionarios[0];
		Funcionario youngest = funcionarios[0];

		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getAge() < youngest.getAge())
				youngest = funcionario;

			if (funcionario.getAge() > oldest.getAge())
				oldest = funcionario;
		}

		System.out.println("\nFuncion�rio mais velho: " + oldest.getNome() + " - " + oldest.getAge());
		System.out.println("Funcion�rio mais novo: " + youngest.getNome() + " - " + youngest.getAge());
	}

	public static int[] ValuesToDate(String dateInText) {
		int[] values = new int[3];
		String[] valuesToStr = dateInText.split("/");

		for (int i = 0; i < valuesToStr.length; i++) {
			values[i] = Integer.parseInt(valuesToStr[i]);
		}
		values[1]--;
		return values;
	}
}
