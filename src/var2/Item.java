package var2;
public class Item extends Volume {
    private double peso;

    public Item(String nome, String tipo, String fabricante, double peso) {
        super(nome, tipo, fabricante);
        this.peso = peso;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void imprimir() {
        System.out.println(getTipo() + " " + getNome() + " " + getFabricante() + ". " + getPeso() + " kg.");
    }
}