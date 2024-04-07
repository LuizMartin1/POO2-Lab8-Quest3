/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg8.quest.pkg3;

/**
 *
 * @author Luiz Henrique
 */
public class Carro implements Veiculo {

    private String cor;
    private String marca;
    private String modelo;
    
    public Carro(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCarro(this);
    }

    String getCor() {
        return cor;
    }

    String getMarca() {
        return marca;
    }

    String getModelo() {
        return modelo;
    }

}
