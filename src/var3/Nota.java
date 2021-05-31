package var3;
import java.util.ArrayList;
import java.util.List;

public abstract class Nota extends Despesa {
    private List<Produto> produtos;

    public Nota(String data, String descricao, String categoria) {
        super(data, descricao, categoria);
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionar(Produto produto) {
        this.produtos.add(produto);
    }
    
    @Override
    public double getValor() {
        double total = 0;
        for (var item : produtos) {
            total += item.getValor();
        }
        return total;
    }
    
    @Override
    public void imprimir() {
        System.out.println(getDescricao() + " (" + getCategoria() + ") em " + getData());    
        int num = 1;
        for (var item : produtos) {
            System.out.print("  " + (num++) + ". ");
            item.imprimir();
        }
        System.out.println("  Valor total: R$" + getValor());         
    }
}
