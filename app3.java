package programas;
import java.util.Scanner;

import entities.Empregado;

public class app3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Empregado empregado = new Empregado();

        System.out.println("DADOS DO EMPREGADO: ");
        System.out.println("NOME: ");
        empregado.nome = sc.nextLine();
        System.out.println("SALÁRIO BRUTO: ");
        empregado.salariobruto = sc.nextDouble();
        System.out.println("Taxa: ");
        empregado.taxa = sc.nextDouble();
        System.out.println("Empregado: "  + empregado.nome +", $"+ empregado.salarioLiquido());
      

        System.out.println("Quanto vc quer aumentar o salário: ");
        double aumentarSalario = sc.nextDouble();
        empregado.aumentarSalario(aumentarSalario);
    
       
        System.out.println("Aumento de salário: " + empregado.nome + ", $"+ empregado.aumentarSalario(aumentarSalario));
        
        sc.close();
        
    }
}
