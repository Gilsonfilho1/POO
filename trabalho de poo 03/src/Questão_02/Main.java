package Questão_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    	
        List<Dvd> dvds = new ArrayList<>();
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Quantos DVD's deseja adicionar? ");
        int quantidade = scanner.nextInt();

        for (int i = 0 ; i < quantidade ; i++){
            scanner  = new Scanner(System.in);

            System.out.print("\nAutor: ");
            String nome = scanner.nextLine();
            Autor autor = new Autor();
            autor.setNome(nome);
            System.out.print("O autor faz carreira solo? (true/false) ");
            autor.setSolo(scanner.nextBoolean());

            Dvd dvd = new Dvd();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine();
            dvd.setAno(ano);
            dvd.setAutor(autor);

            System.out.print("Código: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();
            dvd.setCodigo(codigo);
            System.out.print("Gênero: ");
            String genero = scanner.nextLine();
            dvd.setGenero(genero);
            System.out.print("Gravadora: ");
            String gravadora = scanner.nextLine();
            dvd.setGravadora(gravadora);
            System.out.print("Título: ");
            String titulo = scanner.nextLine();

            dvd.setTitulo(titulo);
            System.out.print("Valor: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();
            dvd.setValor(valor);

            dvds.add(dvd);
        }
        System.out.println("\n" + dvds);
        calculaTotalPreco(dvds);
        menorpreco(dvds);
        maiorrpreco(dvds);
        autoriaSolo(dvds);
        scanner.close();
    }
    public static void calculaTotalPreco(List<Dvd> dvds){

        double total = 0;
        for( int i = 0 ; i < dvds.size() ; i++){
            total += dvds.get(i).getValor();

        }
        System.out.println("\nValor total dos DVDs: " + total);
    }
    
    public static void menorpreco(List<Dvd> dvds){
        Dvd dvd = null;
        double precoAtual = 10000000;

        for(int i = 0 ; i < dvds.size() ; i++){
            if(dvds.get(i).getValor() < precoAtual){
                precoAtual = dvds.get(i).getValor();
                dvd = dvds.get(i);
            }

        }
        System.out.println("DVD mais barato: " + dvd);
    }
    
    public static void maiorrpreco(List<Dvd> dvds){
        Dvd dvd = null;
        double precoAtual = 0.0;

        for(int i = 0 ; i < dvds.size() ; i++){
            if(dvds.get(i).getValor() > precoAtual){
                precoAtual = dvds.get(i).getValor();
                dvd = dvds.get(i);
            }

        }
        System.out.println("DVD mais caro: " +dvd);
    }
    
    public static void autoriaSolo(List<Dvd> dvds){
        List<Dvd> dvdssolo = new ArrayList<>();


        for(int i = 0 ; i < dvds.size() ; i++){
            if(dvds.get(i).getAutor().isSolo()){
               dvdssolo.add(dvds.get(i));
            }

        }
        System.out.println("Carreira solo: " +dvdssolo);

	}

}
