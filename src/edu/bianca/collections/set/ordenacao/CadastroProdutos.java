package edu.bianca.collections.set.ordenacao;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco,quantidade));
    }
    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet); //deixa organizado
        return produtoPorNome;
    }
    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "produto 9", 2d, 2);

       System.out.println(cadastroProdutos.produtoSet);
       System.out.println(cadastroProdutos.exibirProdutoPorNome());
       System.out.println(cadastroProdutos.exibirPorPreco());
    }
}
