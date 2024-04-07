/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2.lab.pkg8.quest.pkg3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiz Henrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Preto", "Honda", "Civic"));
        veiculos.add(new Onibus(50, 2021));
        veiculos.add(new Bicicleta("preta"));

        Visitor printVisitor = new PrintVisitor();
        Visitor messageVisitor = new MensagemVisitor();

        for (Veiculo veiculo : veiculos) {
            veiculo.accept(printVisitor);
            veiculo.accept(messageVisitor);
            System.out.println("----------------------");
        }

    }
}
