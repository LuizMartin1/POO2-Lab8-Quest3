/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg8.quest.pkg3;

/**
 *
 * @author Luiz Henrique
 */
public class MensagemVisitor implements Visitor {

    @Override
    public void visitCarro(Carro carro) {
        System.out.println("Enviando mensagem para o dono do Carro: Favor atualizar dados do IPVA");
    }

    @Override
    public void visitOnibus(Onibus onibus) {
        System.out.println("Enviando mensagem para o dono do onibus: Atencao para atualizacao das licencas");
    }

    @Override
    public void visitBicicleta(Bicicleta bicicleta) {
         System.out.println("Enviando mensagem para o dono da Bicicleta: Comemore no parque o dia do ciclismo");
    }
}
