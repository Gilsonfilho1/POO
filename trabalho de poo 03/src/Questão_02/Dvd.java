package Questão_02;

public class Dvd {
    private Autor autor;
    private String titulo;
    private int codigo;
    private int ano;
    private String genero;
    private Double valor;
    private String gravadora;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public String toString() {
        return "autor=" + autor +
                ", titulo='" + titulo + '\'' +
                ", codigo=" + codigo +
                ", ano=" + ano +
                ", genero='" + genero + '\'' +
                ", valor=" + valor +
                ", gravadora='" + gravadora + '\'';
    }

}
