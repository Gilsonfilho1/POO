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
	private GregorianCalendar dataNascimento;
	private GregorianCalendar dataDeAdmissao;
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

	public GregorianCalendar getBirthDate() {
		return dataNascimento;
	}

	public void setBirthDate(GregorianCalendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public GregorianCalendar getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(GregorianCalendar dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public Funcionario() {
		this.dataDeAdmissao = (GregorianCalendar) Calendar.getInstance();
	}

	public Funcionario(String cPF, String nome, GregorianCalendar dataDeAdmissao) {
		CPF = cPF;
		this.nome = nome;
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public Funcionario(String cpf, String nome, char sexo, double salarioBruto, GregorianCalendar dataNascimento,
			GregorianCalendar dataDeAdmissao) {
		CPF = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.salarioBruto = salarioBruto;
		this.dataNascimento = dataNascimento;
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public boolean ValidateCPF() {
		if (this.CPF.length() == 14)
			return true;

		return false;
	}

	public boolean ValidateBirthDate() {
		if (this.dataNascimento.after(new GregorianCalendar(1920, 0, 1)))
			return true;

		return false;
	}

	public boolean ValidateDataDeAdmissao() {
		if (this.dataDeAdmissao.after(new GregorianCalendar(1995, 0, 1)))
			return true;

		return false;
	}

	public int getAge() {
		GregorianCalendar dataAtual = (GregorianCalendar) Calendar.getInstance();

		int currentYear = dataAtual.get(Calendar.YEAR);
		int currentMonth = dataAtual.get(Calendar.MONTH);
		int currentDay = dataAtual.get(Calendar.DAY_OF_MONTH);

		int birthYear = this.dataNascimento.get(Calendar.YEAR);
		int birthMonth = this.dataNascimento.get(Calendar.MONTH);
		int birthDay = this.dataNascimento.get(Calendar.DAY_OF_MONTH);

		int age = currentYear - birthYear;
		if (currentMonth < birthMonth)
			age--;
		if (currentMonth == birthMonth && currentDay < birthDay)
			age--;
		return age;
	}

	public double NetSalary(double salarioBruto) {
		if (this.salarioBruto <= 3000)
			return (this.salarioBruto * 0.83);
		else
			return (this.salarioBruto * 0.73);
	}

	public boolean isOldest(Funcionario funcionario) {
		return getBirthDate().before(funcionario.getBirthDate());
	}

	@Override
	public String toString() {
		return "[FUNCIONÁRIO]\nCPF: " + CPF + "\nNome: " + nome + "\nSexo: " + sexo + "\nSalário Bruto: " + salarioBruto
				+ "\nSalário Líquido: " + NetSalary(salarioBruto) + "\nData de Nascimento: " + formatador.format(dataNascimento.getTime()) + "\nData de Admissão: "
				+ formatador.format(dataDeAdmissao.getTime());
	}

	@Override
	public boolean equals(Object obj) {
		Funcionario other = (Funcionario) obj;
		return Objects.equals(CPF, other.CPF) && Objects.equals(nome, other.nome) && sexo == other.sexo;
	}

}
