package POO_aulasProgramaçãoOrientadaObjeto.SistemaDeVeículos.Domain;

public class Carro extends Veiculo {
    private int numeroPortas;


    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("O número de portas é: " + this.numeroPortas);
    }

    public void abrirPortaMalas(char portaMalas) {
        switch (portaMalas) {
            case 'n':
            case 'N':
                System.out.println("O porta malas está fechado");
                break;
            case 's':
            case 'S':
                System.out.println("O porta malas foi aberto");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

}

