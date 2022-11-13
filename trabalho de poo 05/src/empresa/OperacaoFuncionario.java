package empresa;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class OperacaoFuncionario {

	public static void FuncionariosValidosEInvalidos(Funcionario[] funcionarios) {
		ArrayList<Funcionario> validos = new ArrayList<Funcionario>();
		ArrayList<Funcionario> invalidos = new ArrayList<Funcionario>();

		for (Funcionario funcionario : funcionarios) {
			if (funcionario.ValidarCPF() && funcionario.ValidarDataAdmissao() && funcionario.ValidarDataNascimento()
					&& (funcionario.getSexo() == 'M' || funcionario.getSexo() == 'F'))
				validos.add(funcionario);
			else {
				invalidos.add(funcionario);
			}
		}

		System.out.println("Funcionários Válidos: ");
		for (Funcionario funcionario : validos) {
			System.out.println(funcionario.toString() + "\n");
		}

		System.out.println("Funcionários Inválidos: ");
		for (Funcionario funcionario : invalidos) {
			System.out.println(funcionario.toString() + "\n");
		}
	}

	public static void FuncionariosDeCadaSexo(Funcionario[] funcionarios) {
		int masculino = 0;
		int feminino = 0;

		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getSexo() == 'M')
				masculino++;
			else if (funcionario.getSexo() == 'F')
				feminino++;
		}

		System.out.println(
				"Ha " + masculino + " funcionarios do sexo masculino e " + feminino + " funcionarios do sexo feminino");
	}

	public static void FuncionarioMaisVelhoeMaisNovo(Funcionario[] funcionarios) {
		Funcionario maisVelho = funcionarios[0];
		Funcionario maisNovo = funcionarios[0];

		for (Funcionario funcionario : funcionarios) {
			if (funcionario.PegarIdade() < maisNovo.PegarIdade())
				maisNovo = funcionario;

			if (funcionario.PegarIdade() > maisVelho.PegarIdade())
				maisVelho = funcionario;
		}

		System.out.println("Funcionário mais velho:");
		System.out.println(maisVelho.getNome() + " - " + maisVelho.PegarIdade());

		System.out.println("\nFuncionário mais novo:");
		System.out.println(maisNovo.getNome() + " - " + maisNovo.PegarIdade());
	}

	public static int[] ValoresParaData(String dataEmTexto) {
		int[] valores = new int[3];
		String[] valoresEmStr = dataEmTexto.split("/");

		for (int i = 0; i < valoresEmStr.length; i++) {
			valores[i] = Integer.parseInt(valoresEmStr[i]);
		}
		valores[1]--;
		return valores;
	}

	public static void DatasDeAposentadoria(Funcionario[] funcionarios) {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Datas de Aposentadoria:\n ");

		for (Funcionario funcionario : funcionarios) {
			System.out.println(
					funcionario.getNome() + " - " + formatador.format(funcionario.dataDeAposentadoria().getTime()) + "\n");
		}
	}

	public static void Bonificacoes(Funcionario[] funcionarios) {
		System.out.println("Bonificações: \n ");
		double totalBonificacoes = 0;

		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.getNome() + " - " + funcionario.getBonificacao() + "\n");
			totalBonificacoes += funcionario.getBonificacao();
		}

		System.out.println("Total de Bonificações: " + totalBonificacoes);
	}
}
