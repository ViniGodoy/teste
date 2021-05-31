package var3;

public abstract class Despesa {
    protected String data;
    protected String descricao;
    protected String categoria;
    
    public Despesa(String data, String descricao, String categoria) {
        super();
        this.data = data;
        this.descricao = descricao;
        this.categoria = categoria;
    }
    
    public String getData() {
        return data;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public abstract double getValor();
    public abstract void imprimir();
}
