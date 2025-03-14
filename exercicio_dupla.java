package Exercicio_grupo;

import java.util.Scanner;

public class exercicio_dupla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = null;

        while (true) {
            System.out.println("\n1. Cadastrar Aluno");
            System.out.println("2. Associar Curso");
            System.out.println("3. Exibir Dados");
            System.out.println("4. Sair");
            System.out.println("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

        if (opcao == 1) {
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Matrícula: ");
            int matricula = scanner.nextInt();
            aluno = new Aluno(nome, idade, matricula);
            System.out.println("Aluno cadastrado!");
        }
        else if (opcao == 2) {
            if (aluno == null) {
                System.out.println("Cadastre um aluno primeiro!");
            } else {
                System.out.println("Nome do curso: ");
                aluno.curso.descricao = scanner.nextLine();
                System.out.println("Curso associado!");
            }
        } 
        else if (opcao == 3) {
            if (aluno == null) {
                System.out.println("Nenhum aluno cadastrado.");
            } else {
                aluno.exibirDados();
            }
        }
        else if (opcao == 4) {
            System.out.println("Saindo!"); 
            scanner.close();
            break;
        }
        else {
            System.out.println("Opção inválida!");
        }
        }
    }
}

// criar a classe curso e alterar o atributo curso da classe Aluno de String para curso