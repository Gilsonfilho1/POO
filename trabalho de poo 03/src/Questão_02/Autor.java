package Questão_02;

public class Autor {
    private String nome;
    private boolean solo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSolo(boolean solo) {
        this.solo = solo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isSolo() {
        return solo;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", solo=" + solo;
    }

}
