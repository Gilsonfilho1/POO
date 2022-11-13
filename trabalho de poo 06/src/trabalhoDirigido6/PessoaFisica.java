package trabalhoDirigido6;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Objects;

public class PessoaFisica extends Pessoa {
	
	public String getCpf() {
		return cpf;
	}

	private String cpf;
	private GregorianCalendar dataNascimento;
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean validarDocumento() {
		if (this.cpf.length() == 14)
			return true;
		else
			return false;
	}
	
	public GregorianCalendar getDataNascimento() {
		return dataNascimento;
	}
	
	
	public void setDataNascimento(GregorianCalendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public PessoaFisica(String nome, String cpf, GregorianCalendar dataNascimento) {
		super(nome);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	
	@Override
	public int calcularIdade() {
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
	
	@Override
	public boolean equals(Object obj) {
		PessoaFisica other = (PessoaFisica) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	@Override
	public String toString() {
		return
				"PESSOA FÌSICA\nNOME: " + getName()  
				+ "\nDATA DE NASCIMENTO: " + dataNascimento.get(Calendar.DAY_OF_MONTH) + "||" + dataNascimento.get(Calendar.MONTH) + "||" + dataNascimento.get(Calendar.YEAR)
				+ "\nDOCUMENTO VÁLIDO: " + validarDocumento()
				+ "\nCPF: " + getCpf()
				+ "\nIDADE: " + calcularIdade() + "\n";
	}

}
