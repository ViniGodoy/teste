package var3;
import java.util.List;
import java.util.ArrayList;

public class Financas {
    private List<Despesa> volumes = new ArrayList<>();
    
    public void adicionar(Despesa item) {
        this.volumes.add(item);
    }
    
    private void imprimir() {
        for (var item : volumes) {
            item.imprimir();
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        var f = new Financas();
        
        var produto = new Produto("03/10 14:01", "Kit 6 decks Magic", "Lazer", 160);
        
        var supermercado = new Supermercado("04/10 13:45", "Wal mart", "Compra do mes");
        supermercado.adicionar(new Produto("04/10 13:46", "Coca-cola", "Alimento", 5.7));
        supermercado.adicionar(new Produto("04/10 13:54", "Limpol", "Limpeza", 0.6));
        supermercado.adicionar(new Produto("04/10 14:31", "Kolgate", "Higiene", 23.0));
        
        
        var visa = new Cartao("25/10", "Santander", "Crédito", "VISA");
        visa.adicionar(new Produto("10/09", "Netflix", "Lazer", 32.9));
        visa.adicionar(new Produto("14/09", "Burguer King", "Alimento", 83.0));
        
        f.adicionar(produto);
        f.adicionar(supermercado);
        f.adicionar(visa);
        
        f.imprimir();
    }
}
