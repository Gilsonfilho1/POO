package trabalhoDirigido6;

import java.util.GregorianCalendar;

public class App {

	public static void main(String[] args) {
		
		Pessoa[] pessoas = new Pessoa[6];
		pessoas[0] = new PessoaFisica("Gilson", "016.016.016-16", new GregorianCalendar(2004, 05, 25));
		pessoas[1] = new PessoaFisica("Julio", "022.222.222-2222", new GregorianCalendar(1980, 02, 22));
		pessoas[2] = new PessoaJuridica("fit bank", "12.122.122/0001-55", new GregorianCalendar(2006, 05, 05));
		pessoas[3] = new PessoaJuridica("Cosmos", "44.444.444/0001-44", new GregorianCalendar(2000, 07, 29));
		pessoas[4] = new PessoaJuridica("Mega Fitiness", "99.888.777/0001-66", new GregorianCalendar(2000, 07, 29));
		pessoas[5] = new PessoaFisica("Iramar", "777.666.555-44", new GregorianCalendar(2004, 9, 01));
		
		ColecaoPessoa dados = new ColecaoPessoa(pessoas);
		
		dados.inserir(new PessoaFisica("Marcos", "123123123123123", new GregorianCalendar(1990, 11, 21)));
		dados.remover(0);
		dados.atualizar(1, new PessoaFisica("Felix", "016.016.016-0166", new GregorianCalendar(1989, 04, 2)));
		System.out.println("Achou pessoa?: " + dados.pesquisar(new PessoaFisica("Julia", "1434324234", new GregorianCalendar(1989, 11, 23))));
		System.out.println("Coleção está vazia?: " + dados.colecaoEstaVazia());
		dados.imprimirDadosColecao();
		
		System.out.println("As pessoas físicas são iguais?: " + pessoas[0].equals(pessoas[1]));
		System.out.println("As pessoas jurídicas são iguais?: " + pessoas[2].equals(pessoas[3]));
		
		System.out.println(dados.retornarObjeto(3));
	

	}

}
