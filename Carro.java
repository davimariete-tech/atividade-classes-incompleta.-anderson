
public class Carro extends Veiculos {
    private String qtdPortas;

    public Carro(String marca, String modelo, int ano, double preco, String qtdPortas) {
        super(marca, ano);
        this.qtdPortas = qtdPortas;
    }

    public String getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(String qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void exibirDados() {
        System.out.println("Marca: " + getMarca());
        
        System.out.println("Ano: " + getano());
        
        System.out.println("Quantidade de Portas: " + getQtdPortas());
    }
    
}
