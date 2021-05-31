package var2;

public class Gabinete extends Container {
    private int gavetas;

    
    public Gabinete(String nome, String tipo, String fabricante, int gavetas) {
        super(nome, tipo, fabricante);
        this.gavetas = gavetas;
    }

    public int getGavetas() {
        return gavetas;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("  OBS: em " + getGavetas() + " gavetas.");
    }
}
