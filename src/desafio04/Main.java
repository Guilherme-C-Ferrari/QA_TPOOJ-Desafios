package desafio04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        String input;

        darBoasVindas();
        do {
            mostrarOpcoes();
            input = scanner.nextLine();
            executarOpcao(biblioteca, input);
        } while (!input.equals("4"));
    }

    public static void darBoasVindas() {
        System.out.println("--------------------------------");
        System.out.println("Bem vindo ao menu da Biblioetca!");
        System.out.println("--------------------------------");
    }

    public static void mostrarOpcoes() {
        System.out.println("\nQual opção deseja acessar?");
        System.out.println("1 - Adicionar um livro.");
        System.out.println("2 - Pegar um livro emprestado.");
        System.out.println("3 - Devolver um livro.");
        System.out.println("4 - Sair do programa.");
    }

    public static void executarOpcao(Biblioteca biblioteca, String input) {
        switch (input) {
            case "1":
                adicionarLivroNaBiblioteca(biblioteca);
                break;
            case "2":
                pegarLivroEmprestadoNaBiblioteca(biblioteca);
                break;
            case "3":
                devolverLivroNaBibliteca(biblioteca);
                break;
            case "4":
                System.out.println("Programa encerrando.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public static void adicionarLivroNaBiblioteca(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o nome do livro que deseja adicionar:");
        String livro = scanner.nextLine();
        System.out.println("Digite o autor do livro que deseja adicionar:");
        String autor = scanner.nextLine();

        try {
            biblioteca.adicionarLivro(livro, autor);
            System.out.println("Livro adicionado na biblioteca.");
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());;
        }
    }

    public static void pegarLivroEmprestadoNaBiblioteca(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o nome do livro que deseja pegar emprestado:");
        String livro = scanner.nextLine();
        System.out.println("Digite o autor do livro que deseja pegar emprestado: ");
        String autor = scanner.nextLine();

        try {
            biblioteca.emprestarLivro(livro, autor);
            System.out.println("Livro foi emprestado. Boa leitura!");
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());;
        }
    }

    public static void devolverLivroNaBibliteca(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o nome do livro que deseja devolver:");
        String livro = scanner.nextLine();
        System.out.println("Digite o autor do livro que deseja devolver: ");
        String autor = scanner.nextLine();

        try {
            biblioteca.devolverLivro(livro, autor);
            System.out.println("Livro foi devolvido. Obrigado!");
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());;
        }
    }
}