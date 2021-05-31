package var1;
import java.util.List;
import java.util.ArrayList;

public class Catalogo {
    private List<Item> itens = new ArrayList<>();
    
    public void adicionar(Item item) {
        this.itens.add(item);
    }
    
    private void imprimir() {
        for (var item : itens) {
            item.imprimir();
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Catalogo c = new Catalogo();
        var filme = new Filme("Bastardos Inglórios", "Aventura/Drama", "Tarantino", 153);
                
        var got = new Serie("Guerra dos Tronos", "Fantasia", "HBO", 3);
        got.adicionar(new Filme("O inverno está chegando", "Drama", "Tim Van Patten", 62));
        got.adicionar(new Filme("A estrada do rei", "Aventura", "Tim Van Patten", 56));
        got.adicionar(new Filme("Lorde Snow", "Aventura", "Brian Kirk", 58));
        
        var show = new Show("Irmãos (Live)", "Samba", "Telo Borges");
        show.adicionar(new Filme("A voz do morro", "Pagode", "Zé Ketti", 2));
        show.adicionar(new Filme("Eu sou o samba", "Samba", "Alexandre Pires", 3));
        
        c.adicionar(filme);
        c.adicionar(got);
        c.adicionar(show);
        
        c.imprimir();
    }
}
