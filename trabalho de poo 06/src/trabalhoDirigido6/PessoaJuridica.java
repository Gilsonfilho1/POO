package trabalhoDirigido6;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	private GregorianCalendar dataCriacao;
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public GregorianCalendar getDataCriacao() {
		return dataCriacao;
	}
	
	public void setDataCriacao(GregorianCalendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public PessoaJuridica(String nome, String cnpj, GregorianCalendar dataCriacao) {
		super(nome);
		this.cnpj = cnpj;
		this.dataCriacao = dataCriacao;
	}
	
	@Override
	public boolean validarDocumento() {
		if (this.cnpj.length() == 18)
			return true;
		else
			return false;
	}
	
	@Override
	public int calcularIdade() {
		GregorianCalendar dataAtual = (GregorianCalendar) Calendar.getInstance();

		int currentYear = dataAtual.get(Calendar.YEAR);
		int currentMonth = dataAtual.get(Calendar.MONTH);
		int currentDay = dataAtual.get(Calendar.DAY_OF_MONTH);

		int birthYear = this.dataCriacao.get(Calendar.YEAR);
		int birthMonth = this.dataCriacao.get(Calendar.MONTH);
		int birthDay = this.dataCriacao.get(Calendar.DAY_OF_MONTH);

		int age = currentYear - birthYear;
		if (currentMonth < birthMonth)
			age--;
		if (currentMonth == birthMonth && currentDay < birthDay)
			age--;
		return age;
	}
	
	@Override
	public boolean equals(Object obj) {
		PessoaJuridica other = (PessoaJuridica) obj;
		return Objects.equals(cnpj, other.cnpj);
	}
	
	@Override
	public String toString() {
		return
				"PESSOA JURÍDICA\nNome: " + getName()  
				+ "\nDATA DE CRIAÇÃO: " + dataCriacao.get(Calendar.DAY_OF_MONTH) + "||" + dataCriacao.get(Calendar.MONTH) + "||" + dataCriacao.get(Calendar.YEAR)
				+ "\nDOCUMENTO VÁLIDO: " + validarDocumento()
				+ "\nIDADE: " + calcularIdade()
				+ "\nCNPJ: " + getCnpj() + "\n";
	}

}
