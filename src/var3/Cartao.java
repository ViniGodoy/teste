package var3;

public class Cartao extends Nota {
    private String bandeira;

    public Cartao(String data, String descricao, String categoria, String bandeira) {
        super(data, descricao, categoria);
        this.bandeira = bandeira;
    }

    public String getBandeira() {
        return bandeira;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("  Bandeira: " + getBandeira());
    }
}
