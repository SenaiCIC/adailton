/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

public class Carro {
    String cor;
    String banco;
    String marca;
    String motor;
    String rodas;
    double preco;
    int qtdeRodas;
    
    public void acelera(){
        System.out.println("Acelera Airton!!!!");
    }
    
    public void freia(){
        System.out.println("Freia esse ...!!!!");
    }
    
    public void mudaDirecao(){
        System.out.println("Vire para a direita!!");
    }
    
    public String toString(){
        String retorno =
        "Cor: "+cor+"\n"+
        "Marca: "+marca+"\n"+
        "Motor: "+motor+"\n"+
        "Rodas: "+rodas+"\n"+
        "Preço: "+preco+"\n"+
        "Quantidade de Rodas: "+qtdeRodas;
        System.out.println(retorno);
        
        return retorno;
    }
    
}
