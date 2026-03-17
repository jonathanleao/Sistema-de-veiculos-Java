package POO_aulasProgramaçãoOrientadaObjeto.SistemaDeVeículos.Domain;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Cilindradas; " + this.cilindradas);
    }

    public void empinar(char empinar) {
        switch (empinar) {
            case 's':
            case 'S':
                System.out.println("Você empinou a moto empinou");
                break;
            case 'n':
            case 'N':
                System.out.println("Não empinou a moto");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

}

