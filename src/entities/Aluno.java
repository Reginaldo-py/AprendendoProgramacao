package entities;

public class Aluno {

    public String nome;
    public double nota1,nota2,nota3;
   

    public double Trimestres() {
        
        return (nota1 + nota2 + nota3);

    }
    

}
