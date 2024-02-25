package src.entities;

/* public class Produto {

    public String name;
    public double preco;
    public int quantidade;

    public double valorTotalProduto() {
        return preco * quantidade;
    }

    public void addProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    // public String toString(){
    // return name + ", $ " + String.format("%.2f", preco)+", " + quantidade + "
    // unidade, total: $ " + String.format("%.2f",valorTotalProduto());
    // }
    public String toString() {
        return "As " + quantidade + " unidade de " + name + " custando $ " + String.format("%.2f", preco)
                + ", vai sair no valor total de: $ " + String.format("%.2f", valorTotalProduto());
    }
} */

// =========================================VERSÃO ATUALIZADA=================================================

/* public class Produto {
    public String name;
    public double preco;
    public int quantidade;

    public Produto(String name, double preco, int quantidade) {

        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotalProduto(int quantidade) {
        return preco * quantidade;
    }

    public void addProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return "As " + quantidade + " unidade de " + name + " custando $ " + String.format("%.2f", preco)
                + ", vai sair no valor total de: $ " + String.format("%.2f", valorTotalProduto(quantidade));
    } */



//====================================codigo atualizado com sobrecarga do construtor========================================
    // =========================================VERSÃO ATUALIZADA=================================================


public class Produto {
    public String name;
    public double preco;
    public int quantidade;

    public Produto(String name, double preco, int quantidade) {

        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    //sobrecarga sem o atributo quantidade, pois ele já vai inicializar com zero
    public Produto(String name, double preco) {

        this.name = name;
        this.preco = preco;
        
    }

    public double valorTotalProduto(int quantidade) {
        return preco * quantidade;
    }

    public void addProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return "As " + quantidade + " unidade de " + name + " custando $ " + String.format("%.2f", preco)
                + ", vai sair no valor total de: $ " + String.format("%.2f", valorTotalProduto(quantidade));
    }
}
