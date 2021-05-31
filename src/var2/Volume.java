package var2;
public abstract class Volume {
    protected String nome;
    protected String tipo;
    protected String fabricante;
    

    public Volume(String nome, String tipo, String fabricante) {
        super();
        this.nome = nome;
        this.tipo = tipo;
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getFabricante() {
        return fabricante;
    }

    
    public abstract double getPeso();
    public abstract void imprimir();
}
