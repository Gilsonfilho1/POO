package Questão_03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scan = new Scanner(System.in);
        boolean y = true;
        int x, id;
        do{
        System.out.println("Sistema de Agenda");
        System.out.println("1- cadastrar contato");
        System.out.println("2- ler contatos");
        System.out.println("3- remover contato");
        System.out.println("4- atualizar contato");
        System.out.println("5- sair");
        x = scan.nextInt();
        switch(x){
            case 1: 
            Contato contato = Contato.formContato();
            agenda.addContato(contato);
            break;            
            case 2:
            agenda.listContato();
            break;
            case 3:
            agenda.listContato();
            System.out.println("Digite o id para deletar");
            id = scan.nextInt();
            agenda.deleteContatoByID(id);
            break;
            case 4:
            System.out.println("Digite o id que quer atualizar");
            id = scan.nextInt();
            Contato updateContato = Contato.formContato();
            agenda.updateContato(updateContato, id);
            break;
            case 5: 
            y= false;
            break;
            default:
            break;
        }
        }while(y);

	}

}
