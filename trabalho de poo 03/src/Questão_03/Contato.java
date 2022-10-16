package Questão_03;

import java.util.Scanner;

public class Contato {
    String nome;
    String telefone;
    String email;
    Contato(){};
    Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }


    public static Contato formContato(){
        Scanner scan = new Scanner(System.in);
        Contato contato = new Contato();
                System.out.println("digite nome, email e telefone");
                contato.nome = scan.nextLine();
                contato.email = scan.nextLine();
                contato.telefone = scan.nextLine();
        return contato;
        
    }

    public String toString(int id) {
        return "Contato["+id+"]" + "nome=" + nome + ", telefone=" + telefone + ", email=" + email;
   
    }
}
