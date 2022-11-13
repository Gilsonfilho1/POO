package empresa;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class Programador extends Funcionario {
	private String[] linguagem;

	public String[] getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String[] linguagem) {
		this.linguagem = linguagem;
	}

	public Programador() {
		super();
		this.linguagem = new String[5];
	}

	public Programador(String cpf, String nome, char sexo, double salarioBruto, GregorianCalendar dataDeNascimento,
			GregorianCalendar dataDeAdmicao, String[] linguagem) {
		super(cpf, nome, sexo, salarioBruto, dataDeNascimento, dataDeAdmicao);
		this.linguagem = linguagem;
	}

	public boolean programaMesmasLinguagens(Programador programador) {
		boolean asMesmas = true;
		if (this.linguagem.length != programador.getLinguagem().length)
			return false;

		for (int i = 0; i < linguagem.length; i++) {
			asMesmas = asMesmas && (this.getLinguagem()[i] == programador.getLinguagem()[i]);
		}

		return asMesmas;
	}

	@Override
	public String toString() {
		return "Programador \nlinguagem = " + Arrays.toString(linguagem) + "\nCPF = " + getCPF() + "\nNome = " + getNome()
				+ "\nSexo = " + getSexo() + "\nSalario Bruto = " + getSalarioBruto() + "\nData De Nascimento = "
				+ getDataDeNascimento() + "\nData De Admicao = " + getDataDeAdmicao();
	}
}
