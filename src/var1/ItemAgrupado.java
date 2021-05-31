package var1;
import java.util.ArrayList;
import java.util.List;

public abstract class ItemAgrupado extends Item {
    private List<Filme> filmes;

    public ItemAgrupado(String titulo, String genero, String diretor) {
        super(titulo, genero, diretor);
        this.filmes = new ArrayList<>();
    }
    
    public void adicionar(Filme filme) {
        this.filmes.add(filme);
    }
    
    @Override
    public int getDuracao() {
        int total = 0;
        for (var filme : filmes) {
            total += filme.getDuracao();
        }
        return total;
    }
    
    @Override
    public void imprimir() {
        System.out.println(getTitulo() + " - (" + getGenero() + ")");    
        int num = 1;
        for (var filme : filmes) {
            System.out.print("  " + (num++) + ". ");
            filme.imprimir();
        }
        System.out.println("  Duração total: " + getDuracao() + " min.");         
    }
}
