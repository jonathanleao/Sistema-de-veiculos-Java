package POO_aulasProgramaçãoOrientadaObjeto.SistemaDeVeículos.Test;

import POO_aulasProgramaçãoOrientadaObjeto.SistemaDeVeículos.Domain.Caminhao;
import POO_aulasProgramaçãoOrientadaObjeto.SistemaDeVeículos.Domain.Carro;
import POO_aulasProgramaçãoOrientadaObjeto.SistemaDeVeículos.Domain.Moto;

import java.util.Scanner;

public class VeiculosMain {
    static void main(String[] args) {
        //declarando as variaveis de referência e seus dados
        Scanner scanner = new Scanner(System.in);
        Carro carro= new Carro("Nissan", "Skyline GT-R R34",1999, 2);
        Moto moto = new Moto("Honda", "CBX 550 Twister", 2008, 250 );
        Caminhao caminhao = new Caminhao("Mercedes-benz", "Actros 2651", 2015,74000 );

        //execução da impressão de dados,scanners de cada veículo
        carro.imprimeDados();
        System.out.println("deseja abrir o porta malas?");
        carro.abrirPortaMalas(scanner.nextLine().charAt(0));
        System.out.println("deseja ligar o veiculo?");
        carro.setLigarVeiculo(scanner.nextLine().charAt(0));
        carro.ligar();

        System.out.println("-------------------------------------------------------------------");

        moto.imprimeDados();
        System.out.println("desejar ligar o veiculo?");
        moto.setLigarVeiculo(scanner.nextLine().charAt(0));
        moto.ligar();
        System.out.println("deseja empinar a moto?");
        moto.empinar(scanner.nextLine().charAt(0));

        System.out.println("-------------------------------------------------------------------");
        caminhao.imprimeDados();
        System.out.println("quanto desejar transportar de carga?");
        caminhao.setCarga(scanner.nextDouble());
        caminhao.carregarCarga();



    }
}
