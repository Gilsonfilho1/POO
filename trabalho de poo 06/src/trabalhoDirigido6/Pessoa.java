package trabalhoDirigido6;

public abstract class Pessoa {

	private String nome;
	
	public abstract boolean validarDocumento();
	public abstract int calcularIdade();
	
	public String getName() {
		return nome;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

}
