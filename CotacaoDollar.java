package programas;

import java.util.Scanner;

import entities.Calculador;

public class CotacaoDollar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto é cotação do Dollar: ");
        double valor = sc.nextDouble();
        System.out.print("Quanto em dollares você deseja comprar: ");
        double quantidade = sc.nextDouble();
        double v = Calculador.cotacao(valor, quantidade);
       
        System.out.printf("Total em reais R$: %.2f\n", v);
        

        sc.close();               
    }
    
}


/*qual e o preço do dollar: ?
 * quantos dollar vc quer compar?
 * quanot valor total  em reias?
 */