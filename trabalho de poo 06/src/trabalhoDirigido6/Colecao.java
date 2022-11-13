package trabalhoDirigido6;

public interface Colecao {
	public boolean inserir(Pessoa p);
	public boolean remover(int indice);
	public void atualizar(int indice, Pessoa p);
	public boolean pesquisar(Pessoa p);
	public boolean colecaoEstaVazia();
	public void imprimirDadosColecao();
	public Pessoa retornarObjeto(int indice);
}
