package POO_aulasProgramaçãoOrientadaObjeto.SistemaDeVeículos.Domain;

public class Caminhao extends Veiculo {

    private double capacidadeCarga;
    private double carga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("a capacidade de carga é " + this.capacidadeCarga);
    }

    public void carregarCarga() {
        if (carga > capacidadeCarga) {
            System.out.println("Ultrapassou a capacidade de carga");
        } else {
            System.out.println("O caminhão está transportando " + this.carga + "KG");
        }

    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
}

