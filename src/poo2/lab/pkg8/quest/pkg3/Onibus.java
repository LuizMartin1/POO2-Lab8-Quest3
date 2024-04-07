/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg8.quest.pkg3;

/**
 *
 * @author Luiz Henrique
 */
public class Onibus implements Veiculo {

    private int qtdLugares;
    private int anoFabricacao;
    
    public Onibus(int qtdLugares, int anoFabricacao) {
        this.qtdLugares = qtdLugares;
        this.anoFabricacao = anoFabricacao;
    }
    
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visitOnibus(this);
    }

    public int getQtdLugares() {
        return qtdLugares;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
}
