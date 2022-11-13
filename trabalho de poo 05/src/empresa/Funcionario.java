package empresa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Funcionario {
	private String CPF;
	private String nome;
	private char sexo;
	private double salarioBruto;
	private GregorianCalendar dataDeNascimento;
	private GregorianCalendar dataDeAdmicao;
	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public GregorianCalendar getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(GregorianCalendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public GregorianCalendar getDataDeAdmicao() {
		return dataDeAdmicao;
	}

	public void setDataDeAdmicao(GregorianCalendar dataDeAdmicao) {
		this.dataDeAdmicao = dataDeAdmicao;
	}

	public Funcionario() {
		this.dataDeAdmicao = (GregorianCalendar) Calendar.getInstance();
	}

	public Funcionario(String cPF, String nome, GregorianCalendar dataDeAdmicao) {
		CPF = cPF;
		this.nome = nome;
		this.dataDeAdmicao = dataDeAdmicao;
	}

	public Funcionario(String cpf, String nome, char sexo, double salarioBruto, GregorianCalendar dataDeNascimento,
			GregorianCalendar dataDeAdmicao) {
		CPF = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.salarioBruto = salarioBruto;
		this.dataDeNascimento = dataDeNascimento;
		this.dataDeAdmicao = dataDeAdmicao;
	}

	public boolean ValidarCPF() {
		if (this.CPF.length() == 14)
			return true;

		return false;
	}

	public boolean ValidarDataNascimento() {
		if (this.dataDeNascimento.after(new GregorianCalendar(1920, 0, 1)))
			return true;

		return false;
	}

	public boolean ValidarDataAdmissao() {
		if (this.dataDeAdmicao.after(new GregorianCalendar(1995, 0, 1)))
			return true;

		return false;
	}

	public int PegarIdade() {
		GregorianCalendar dataAtual = (GregorianCalendar) Calendar.getInstance();

		int anoAtual = dataAtual.get(Calendar.YEAR);
		int mesAtual = dataAtual.get(Calendar.MONTH);
		int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);

		int anoNascimento = this.dataDeNascimento.get(Calendar.YEAR);
		int mesNascimento = this.dataDeNascimento.get(Calendar.MONTH);
		int diaNascimento = this.dataDeNascimento.get(Calendar.DAY_OF_MONTH);

		int idade = anoAtual - anoNascimento;
		if (mesAtual < mesNascimento)
			idade--;
		if (mesAtual == mesNascimento && diaAtual < diaNascimento)
			idade--;
		return idade;
	}

	public double SalarioLiquido() {
		if (this.salarioBruto <= 3000)
			return (this.salarioBruto * 0.83);
		else
			return (this.salarioBruto * 0.73);
	}

	public double getBonificacao() {
		double bonificacao = (2 / 100) * 12 * getSalarioBruto();
		return bonificacao;
	}

	public GregorianCalendar dataDeAposentadoria() {
		int anoAdmissao = this.dataDeNascimento.get(Calendar.YEAR);
		int mesAdmissao = this.dataDeNascimento.get(Calendar.MONTH);
		int diaAdmissao = this.dataDeNascimento.get(Calendar.DAY_OF_MONTH);

		if (getSexo() == 'M')
			anoAdmissao += 35;

		else if (getSexo() == 'F')
			anoAdmissao += 30;

		GregorianCalendar aposentadoria = new GregorianCalendar(anoAdmissao, mesAdmissao, diaAdmissao);

		return aposentadoria;
	}

	public boolean eMaisVelho(Funcionario funcionario) {
		return getDataDeNascimento().before(funcionario.getDataDeNascimento());
	}

	@Override
	public String toString() {
		return "Funcionario:\nCPF: " + CPF + "\nNome: " +
	nome + "\nSexo: " + sexo 
	+ "\nSalario Bruto: " + salarioBruto
				+ "\nData De Nascimento: " + formatador.format(dataDeNascimento.getTime()) + "\nData De Admicao: "
				+ formatador.format(dataDeAdmicao.getTime());
	}

	@Override
	public boolean equals(Object obj) {
		Funcionario other = (Funcionario) obj;
		return Objects.equals(CPF, other.CPF) && Objects.equals(nome, other.nome) && sexo == other.sexo;
	}

}
