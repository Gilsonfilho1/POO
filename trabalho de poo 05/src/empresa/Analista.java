package empresa;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class Analista extends Funcionario {
	private String[] diagrama;

	public String[] getDiagrama() {
		return diagrama;
	}

	public void setDiagrama(String[] diagrama) {
		this.diagrama = diagrama;
	}

	public Analista() {
		super();
		this.diagrama = new String[5];
	}

	public Analista(String cpf, String nome, char sexo, double salarioBruto,
			GregorianCalendar dataDeNascimento,
			GregorianCalendar dataDeAdmicao, String[] diagrama) {
		super(cpf, nome, sexo, salarioBruto, dataDeNascimento, dataDeAdmicao);

		this.diagrama = diagrama;
	}

	public boolean programaMesmasLinguagens(Analista analista) {
		boolean asMesmas = true;
		if (this.diagrama.length != analista.getDiagrama().length)
			return false;

		for (int i = 0; i < diagrama.length; i++) {
			asMesmas = asMesmas && (this.getDiagrama()[i] == analista.getDiagrama()[i]);
		}

		return asMesmas;
	}

	@Override
	public double getBonificacao() {
		double bonificacao = (3 / 100) * 12 * getSalarioBruto();
		return bonificacao;
	}

	@Override
	public String toString() {
		return "Programador \n diagrama= " + Arrays.toString(diagrama) +
				"\nCPF = " + getCPF() + "\nNome = " + getNome()
				+ "\nSexo = " + getSexo() + "\nSalario Bruto = " + getSalarioBruto() +
				"\nData De Nascimento = "
				+ getDataDeNascimento() + "\nData De Admicao = " +
				getDataDeAdmicao();
	}
}
