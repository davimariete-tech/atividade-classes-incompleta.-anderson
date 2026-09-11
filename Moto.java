public class Moto extends Veiculos {
    private String cilindrada;

    public Moto(String marca, String ano, String cilindrada) {
        super(marca, ano);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirDados() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Ano: " + getAno());
        System.out.println("Cilindrada: " + getCilindrada());
    }
}