/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg8.quest.pkg3;

/**
 *
 * @author Luiz Henrique
 */
public class PrintVisitor implements Visitor {

    @Override
    public void visitCarro(Carro carro) {
        System.out.println("Dados do Carro:");
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
    }

    @Override
    public void visitOnibus(Onibus onibus) {
         System.out.println("Dados do onibus:");
        System.out.println("Quantidade de Lugares: " + onibus.getQtdLugares());
        System.out.println("Ano de Fabricacao: " + onibus.getAnoFabricacao());
    }

    @Override
    public void visitBicicleta(Bicicleta bicicleta) {
        System.out.println("Dados da Bicicleta:");
        System.out.println("Cor: " + bicicleta.getCor());
    }  
}
