package var3;
public class Produto extends Despesa {
    private double valor;

    public Produto(String data, String descricao, String categoria, double valor) {
        super(data, descricao, categoria);
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void imprimir() {
        System.out.println(getData() + " - " + getDescricao() + " (" + getCategoria() + "): R$" + getValor());
    }
}