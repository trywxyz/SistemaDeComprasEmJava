package src;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Compra: descricao = " + descricao + ", valor = " + valor ;
    }

    @Override
    public int compareTo(Compra o) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(o.valor));
    }
}
