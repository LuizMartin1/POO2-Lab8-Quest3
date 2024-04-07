/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg8.quest.pkg3;

/**
 *
 * @author Luiz Henrique
 */
public class Bicicleta implements Veiculo {

    private String cor;
    
    public Bicicleta(String cor) {
        this.cor = cor;
    }
    
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visitBicicleta(this);
    }

    String getCor() {
        return cor;
    }
}
