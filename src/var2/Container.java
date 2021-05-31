package var2;
import java.util.ArrayList;
import java.util.List;

public abstract class Container extends Volume {
    private List<Item> itens;

    
    
    public Container(String nome, String tipo, String fabricante) {
        super(nome, tipo, fabricante);
        this.itens = new ArrayList<>();
    }

    public void adicionar(Item item) {
        this.itens.add(item);
    }
    
    @Override
    public double getPeso() {
        double total = 0;
        for (var item : itens) {
            total += item.getPeso();
        }
        return total;
    }
    
    @Override
    public void imprimir() {
        System.out.println(getNome() + " (" + getFabricante() + ")");    
        int num = 1;
        for (var item : itens) {
            System.out.print("  " + (num++) + ". ");
            item.imprimir();
        }
        System.out.println("  Peso total: " + getPeso() + " kg.");         
    }
}
