package var1;
public class Filme extends Item {
    private int duracao;

    public Filme(String titulo, String genero, String diretor, int duracao) {
        super(titulo, genero, diretor);
        this.duracao = duracao;
    }

    @Override
    public int getDuracao() {
        return duracao;
    }

    @Override
    public void imprimir() {
        System.out.println(getTitulo() + " (" + getGenero() + ") - " + getDuracao() + " min.");
    }
}