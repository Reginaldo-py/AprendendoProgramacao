package entities;

public class Empregado {
    public String nome;
    public double salariobruto;
    public double taxa;



    public double salarioLiquido(){

        
        return salariobruto - taxa;
       

    }
    public double aumentarSalario(double porcentagem){

            return +salarioLiquido()+(porcentagem * salariobruto / 100);

    }
   
}
