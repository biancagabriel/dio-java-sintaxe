package edu.bianca.collections.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome,matricula,media));
    }
    public void exibirAlunos(){
        System.out.println(alunoSet);
    }
    public void exibirAlunosPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        System.out.println(alunoPorNome);
    }
    public void exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorMedia());
        alunoPorNota.addAll(alunoSet);
        System.out.println(alunoPorNota);
    }
    public void removerAluno(long matricula){
        Aluno alunoRemover = null;
        for (Aluno a : alunoSet){
            if(a.getMatricula() == matricula){
                alunoRemover = a;
                break;
            }
        }
        alunoSet.remove(alunoRemover);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.adicionarAluno("ana", 1l,7.0);
        gerenciadorAlunos.adicionarAluno("bianca", 2l,10.0);
        gerenciadorAlunos.adicionarAluno("caio", 3l,3.0);
        gerenciadorAlunos.adicionarAluno("mayara", 4l,9.0);
        gerenciadorAlunos.adicionarAluno("raquel", 5l,9.0);

        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();
        gerenciadorAlunos.removerAluno(3l);
    }
}
