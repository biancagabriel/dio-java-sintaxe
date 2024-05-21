package edu.bianca.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroslist;

    public CatalogoLivros() {
        this.livroslist = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroslist.add(new Livro(titulo, autor,anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroslist.isEmpty()){
            for(Livro l : livroslist){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeAnos= new ArrayList<>();
        if(!livroslist.isEmpty()){
            for(Livro l : livroslist){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloDeAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }
    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroslist.isEmpty()){
            for(Livro l : livroslist){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor 2"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020,2021));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));
    }
}
