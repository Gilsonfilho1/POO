package trabalhoDirigido6;

public class ColecaoPessoa implements Colecao {
	private Pessoa[] dados;
	private int posicaoCorrente;
	
	public ColecaoPessoa(Pessoa[] dados) {
		this.dados = dados;
	}
	
	public ColecaoPessoa(Pessoa[] dados, int posicaoCorrente) {
		this.dados = dados;
		this.posicaoCorrente = posicaoCorrente;
	}

	@Override
	public boolean inserir(Pessoa p) {
		try {
			Pessoa[] pessoa = new Pessoa[dados.length + 1];
		    for (int i = 0; i < dados.length; i++) {
		    	pessoa[i] = dados[i];
		    }
		    pessoa[dados.length] = p;
		    dados = pessoa;
		    return true;
		}
		catch (Exception ex) {
			return false;
		}
	}
	
	@Override
	public boolean remover(int indice) {
		try {
			Pessoa[] pessoa = new Pessoa[dados.length - 1];
		    for (int i = 0, k = 0; i < dados.length; i++) {
		    	if (i!=this.posicaoCorrente) {
		    		pessoa[k] = dados[i];
		    		k++;
		    	}
		    }
		    dados = pessoa;
		    return true;
		}
		catch (Exception ex) {
			return false;
		}
	}
	
	@Override
	public void atualizar(int indice, Pessoa p) {
		try {
			this.dados[indice] = p;
			System.out.println("Dados atualizados!!!!!\n" + p);
		}
		catch (Exception ex) {
			System.out.println("Erro na atualização dos dados!!!!");
		}
	}
	
	
	@Override
	public Pessoa retornarObjeto(int indice) {
		return this.dados[indice];
	}
	
	@Override
	public boolean colecaoEstaVazia() {
		if (this.dados.length == 0)
			return true;
		else
			return false;
	}
	
	@Override
	public void imprimirDadosColecao() {
		for (Pessoa pessoa: this.dados) {
			System.out.println(pessoa + "\n");
		}
	}
	
	@Override
	public boolean pesquisar(Pessoa p) {
		boolean found = false;
		
		for(Pessoa x : this.dados){
		    if(x == p){
		        found = true;
		        break;
		    }
		}
		return found;
	}
	

}
