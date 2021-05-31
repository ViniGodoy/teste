package var2;
import java.util.List;
import java.util.ArrayList;

public class Caminhao {
    private List<Volume> volumes = new ArrayList<>();
    
    public void adicionar(Volume item) {
        this.volumes.add(item);
    }
    
    private void imprimir() {
        for (var item : volumes) {
            item.imprimir();
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Caminhao c = new Caminhao();
        
        var item = new Item("New Magestic", "Colchão", "Ortobom", 12);
        
        var caixa = new Caixa("N22", "Caixa de papelão", "NZB Embalagens");
        caixa.adicionar(new Item("Harry Potter vol. 1", "Livro", "J.K. Rowling", 1.3));
        caixa.adicionar(new Item("Harry Potter - 1/10", "Toy", "Iron Studios", 0.6));
        caixa.adicionar(new Item("Mapa do Maroto", "Mousepad", "Fabrica geek", 0.2));
        
        
        var gabinete = new Gabinete("Gabinete", "Metalico", "Santana", 1);
        gabinete.adicionar(new Item("Pasta de documentos", "Pasta", "Indefinido", 3.5));
        gabinete.adicionar(new Item("Lápis de cor", "Aquarelado", "Faber Castel", 0.7));
        
        c.adicionar(item);
        c.adicionar(caixa);
        c.adicionar(gabinete);
        
        c.imprimir();
    }
}
