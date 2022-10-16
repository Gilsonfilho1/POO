package Questão_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        ArrayList<ContaLuz> lista = new ArrayList<>();
        ArrayList<String> contas = new ArrayList<>();

        int controle = 1;
        double soma = 0;
        Scanner ler = new Scanner(System.in);
        double maiorConta = 0, menorConta = 0;
        int maiorContaId = 0, menorContaId = 0;

        while (controle == 1) {
            System.out.println("Conta " + (lista.size() + 1));
            System.out.println("Digite o codigo da sua conta: ");
            String contaCodigo = ler.next();

            System.out.println("Digite a data de leitura apenas numeros (dd/mm/yyyy)");
            int dataLeitura = ler.nextInt();

            System.out.println("Informe a quantidade de kw gastos no mês: ");
            int kwGasto = ler.nextInt();

            System.out.println("Digite o valor da conta");
            double valorDaConta = ler.nextDouble();
            soma += valorDaConta;

            if (lista.isEmpty()) {
                maiorConta = valorDaConta;
                menorConta = valorDaConta;
            } else if(maiorConta<valorDaConta){
                maiorConta = valorDaConta;
                maiorContaId = lista.size();
            } else if(menorConta>valorDaConta){
                menorConta = valorDaConta;
                menorContaId = lista.size();
            }

            maiorContaId = (maiorConta < valorDaConta) ? lista.size() : maiorContaId;
            menorContaId = (menorConta > valorDaConta) ? lista.size() : menorContaId;

            System.out.println("Digite a data de vencimento apenas numeros (dd/mm/yyyy)");
            int dataVencimento = ler.nextInt();
            boolean foiPaga = false;
            boolean pagoNoPrazo = false;
            
            System.out.println("A conta foi paga?");
            if ("sim".equals(ler.next())) {
                foiPaga = true;

                System.out.println("Digite a data de pagamento apenas numeros (dd/mm/yyyy)");
                int dataPagamento = ler.nextInt();
                pagoNoPrazo = (dataVencimento - dataPagamento) >= 0;
            }
            String confirmacao = foiPaga == true ? "Paga": "não paga";
            contas.add(confirmacao);

            ContaLuz conta = new ContaLuz(contaCodigo, dataLeitura, kwGasto, valorDaConta, dataVencimento, foiPaga, pagoNoPrazo);
            lista.add(conta);

            System.out.println(conta);

            System.out.println("Adicionar mais contas? 1  para sim ou 0 para não");
            controle = ler.nextInt();

        }

        System.out.println("==================================");
        System.out.println("Conta mais cara: Conta " + (maiorContaId + 1) + "\n\n" + lista.get(maiorContaId));
        System.out.println("==================================");
        System.out.println("Conta mais barata: Conta " + (menorContaId + 1) + "\n\n" + lista.get(menorContaId));
        System.out.println("==================================");
        
        for (int i = 0; i < contas.size(); i++){
            System.out.println("Conta "+ i + ": " +contas.get(i));
        }
        
        System.out.println("Media de gasto: R$ " + soma / (lista.size()));
        
        
	}

}
