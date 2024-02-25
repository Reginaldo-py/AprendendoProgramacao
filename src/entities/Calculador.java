package entities;

public class Calculador {

    public final static double IOF = 0.06;
      
    public static double cotacao(double preco, double quantidade){
        
        double tributacao = preco * quantidade * IOF;
        return tributacao + preco * quantidade; 

        
    }
}
