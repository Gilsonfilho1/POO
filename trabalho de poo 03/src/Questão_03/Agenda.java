package Questão_03;

import java.util.ArrayList;

public class Agenda {
    private Contato[] contatos;

    Agenda(){
        this.contatos =  new Contato[100];
    }
    
    public void addContato(Contato contato){
        for (int i = 0; i < contatos.length; i++) {
            if(contatos[i] == null){
                  contatos[i] = contato;
                  break;
            }
            
        }
     
    }
    
    public void deleteContatoByID(int id){
        if(id >= 0 && id < 99){
        contatos[id] = null;
        }
    }
    
    public void listContato(){
        Contato[] contatos = getContatos();
        if(contatos.length > 0  ){
        for (int i = 0; i < contatos.length; i++) {
            if(contatos[i] != null){
            System.out.println(""+ contatos[i].toString(i));   
            }
        }
        }else {
            System.out.println("Sem dados");
        }
       
    }
    
    public void updateContato(Contato contato, int id){
        contatos[id] = contato;
    }
    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

}
