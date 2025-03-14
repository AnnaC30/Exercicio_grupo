package Exercicio_grupo;

public class Aluno extends Pessoa {
    int  matricula;
    Curso curso;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = new Curso();
    }

    public void exibirDados() {
        System.out.println("\nAluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula != null ? matricula: "Não matriculado!");
        System.out.println("Curso: " + curso != null ? curso.descricao: "Não associado!");
    }

}