package POO_aulasProgramaçãoOrientadaObjeto.SistemaDeVeículos.Domain;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private char ligarVeiculo;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void imprimeDados() {
        System.out.println("Marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("ano: " + this.ano);
    }

    public void ligar() {
        switch (ligarVeiculo) {
            case 's':
            case 'S':
                System.out.println("O veiculo foi ligado ");
                break;
            case 'n':
            case 'N':
                System.out.println("O veiculo não foi ligado");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public char getLigarVeiculo() {
        return ligarVeiculo;
    }

    public void setLigarVeiculo(char ligarVeiculo) {
        this.ligarVeiculo = ligarVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}