package Questão_01;

public class ContaLuz {
    private String contaCodigo;
    private int dataLeitura;
    private int kwGasto;
    private double valorDaConta;
    private int dataVencimento;
    private boolean pagoNoPrazo;
    private boolean foiPaga;

    public ContaLuz(String contaCodigo, int dataLeitura, int kwGasto, double valorDaConta, int dataVencimento, boolean pagoNoPrazo, boolean foiPaga) {
        this.contaCodigo = contaCodigo;
        this.dataLeitura = dataLeitura;
        this.kwGasto = kwGasto;
        this.valorDaConta = valorDaConta;
        this.dataVencimento = dataVencimento;
        this.pagoNoPrazo = pagoNoPrazo;
        this.foiPaga = foiPaga;
    }
    
    public boolean isFoiPaga() {
        return foiPaga;
    }

    public void setFoiPaga(boolean foiPaga) {
        this.foiPaga = foiPaga;
    }
    
    public boolean isPagoNoPrazo() {
        return pagoNoPrazo;
    }

    public void setPagoNoPrazo(boolean pagoNoPrazo) {
        this.pagoNoPrazo = pagoNoPrazo;
    }

    public String getContaCodigo() {
        return contaCodigo;
    }

    public void setContaCodigo(String contaCodigo) {
        this.contaCodigo = contaCodigo;
    }

    public int getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(int dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public int getKwGasto() {
        return kwGasto;
    }

    public void setKwGasto(int kwGasto) {
        this.kwGasto = kwGasto;
    }

    public double getValorDaConta() {
        return valorDaConta;
    }

    public void setValorDaConta(double valorDaConta) {
        this.valorDaConta = valorDaConta;
    }

    public int getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(int dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    @Override
        public String toString(){
            String p =  this.isFoiPaga() ? "\nFoi pago dentro do prazo: " + this.isPagoNoPrazo() :"" ;  
        return "Data de Leitura: " + this.getDataLeitura() +
                "\nData de vencimento: " + this.getDataVencimento() +
                "\nCodigo da Conta: " + this.getContaCodigo() +
                "\nKw Gasto: " + this.getKwGasto() +
                "\nValor da conta: R$ " + this.getValorDaConta() +
                "\nFoi pago? " + this.isFoiPaga() +
                p ;
        }
}
