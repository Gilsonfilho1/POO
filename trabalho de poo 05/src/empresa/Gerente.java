package empresa;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class Gerente extends Funcionario {
	private String[] metodologiaDesenvolvimento;

	public String[] getMetodologiaDesenvolvimento() {
		return metodologiaDesenvolvimento;
	}

	public void setMetodologiaDesenvolvimento(String[] metodologiaDesenvolvimento) {
		this.metodologiaDesenvolvimento = metodologiaDesenvolvimento;
	}

	public Gerente() {
		super();
		this.metodologiaDesenvolvimento = new String[5];
	}

	public Gerente(String cpf, String nome, char sexo, double salarioBruto, GregorianCalendar dataDeNascimento,
			GregorianCalendar dataDeAdmicao, String[] metodologiaDesenvolvimento) {
		super(cpf, nome, sexo, salarioBruto, dataDeNascimento, dataDeAdmicao);

		this.metodologiaDesenvolvimento = metodologiaDesenvolvimento;
	}
	
	public boolean dominaMesmasMetodologias(Gerente gerente) {
		boolean asMesmas = true;
		if (this.metodologiaDesenvolvimento.length != gerente.getMetodologiaDesenvolvimento().length)
			return false;

		for (int i = 0; i < metodologiaDesenvolvimento.length; i++) {
			asMesmas = asMesmas && (this.getMetodologiaDesenvolvimento()[i] == gerente.getMetodologiaDesenvolvimento()[i]);
		}

		return asMesmas;
	}
	
	@Override
	public double getBonificacao() {
		double bonificacao = (5 / 100) * 12 * getSalarioBruto();
		return bonificacao;
	}
	
	@Override
	public String toString() {
		return "Programador \nMetodologia de Desenvolvimento = " + Arrays.toString(metodologiaDesenvolvimento) + "\nCPF = " + getCPF() + "\nNome = " + getNome()
				+ "\nSexo = " + getSexo() + "\nSalario Bruto = " + getSalarioBruto() + "\nData De Nascimento = "
				+ getDataDeNascimento() + "\nData De Admicao = " + getDataDeAdmicao();
	}
}
