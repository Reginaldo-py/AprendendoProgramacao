
/* import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();
        System.out.println("entre com os dados do produto: ");
        System.out.println("Nome: ");
        p.name = sc.nextLine();
        System.out.printf("Preço: ");
        p.preco = sc.nextDouble();
        System.out.println("Quantidade: ");
        p.quantidade = sc.nextInt();
        p.toString();
        System.out.println();
        System.out.println("Produto dados: " + p);

        System.out.println();
        System.out.println("Entre com a quantidade de produtos a ser adicionado no estoque: ");
        int quantidade = sc.nextInt();
        p.addProduto(quantidade);

        System.out.println();
        System.out.println("dados atualizados: " + p);

        System.out.println();
        System.out.println("Entre com a quantidade de produtos a ser removido no estoque: ");
        quantidade = sc.nextInt();
        p.removerProduto(quantidade);

        System.out.println();
        System.out.println("dados atualizados: " + p);

        sc.close();

    }

} */
 

// =================================================VERSÃO ATUALIZADO=========================================================

import java.util.Scanner;

import src.entities.Produto;

//import entities.Produto;

public class app1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("entre com os dados do produto: ");
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.printf("Preço: ");
        double preco = sc.nextDouble();
       // System.out.println("Quantidade: "); comentado para testar a sobrecarga do construtor
       // int quantidade = sc.nextInt();
        
        Produto produto = new Produto(name, preco /*quantidade*/); // aqui vamos ter que retirá o quantidade para testar a sobrecarga

         produto.toString();
         System.out.println();
         System.out.println("Produto dados: " + produto);
          

        System.out.println();
        System.out.println("Entre com a quantidade de produtos a ser adicionado no estoque: ");
        int quantidade = sc.nextInt(); // iremos ter que definir como int para poder aceitar as modificações
        produto.addProduto(quantidade);

        System.out.println();
        System.out.println("dados atualizados: " + produto);

        System.out.println();
        System.out.println("Entre com a quantidade de produtos a ser removido no estoque: ");
        quantidade = sc.nextInt();
        produto.removerProduto(quantidade);

        System.out.println();
        System.out.println("dados atualizados: " + produto);

        sc.close();

    }

} 
