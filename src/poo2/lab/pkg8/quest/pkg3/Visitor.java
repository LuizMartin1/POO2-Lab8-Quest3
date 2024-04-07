/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poo2.lab.pkg8.quest.pkg3;

/**
 *
 * @author Luiz Henrique
 */
public interface Visitor {
    void visitCarro(Carro carro);
    void visitOnibus(Onibus onibus);
    void visitBicicleta(Bicicleta bicicleta);
}
