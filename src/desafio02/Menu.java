package desafio02;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    public static void rodarMenu() {
        AgendaTelefonica agenda = new AgendaTelefonica();
        Scanner scanner = new Scanner(System.in);
        String input;

        darBoasVindas();
        do {
            mostrarOpcoes();
            input = scanner.nextLine();
            executarOpcao(agenda, input);
        } while (!input.equals("6"));
    }

    public static void darBoasVindas() {
        System.out.println("-------------------------------------------");
        System.out.println("Bem vindo ao menu de sua Agenda Telefonica!");
        System.out.println("-------------------------------------------");
    }

    public static void mostrarOpcoes() {
        System.out.println("\nQual opção deseja acessar?");
        System.out.println("1 - Adicionar um novo contato.");
        System.out.println("2 - Remover um contato existente.");
        System.out.println("3 - Buscar um contato pelo nome.");
        System.out.println("4 - Atualizar informações de um contato.");
        System.out.println("5 - Listar todos os contatos na agenda.");
        System.out.println("6 - Sair do programa.");
    }

    public static void executarOpcao(AgendaTelefonica agenda, String input) {
        switch (input) {
            case "1":
                adicionarContatoNaAgenda(agenda);
                break;
            case "2":
                removerContatoNaAgenda(agenda);
                break;
            case "3":
                buscarContatoNaAgenda(agenda);
                break;
            case "4":
                atualizarContatoNaAgenda(agenda);
                break;
            case "5":
                listarContatoNaAgenda(agenda);
                break;
            case "6":
                System.out.println("Programa encerrando.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public static void adicionarContatoNaAgenda(AgendaTelefonica agenda) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do contato que deseja adicionar:");
        String input = scanner.nextLine();
        System.out.println("Digite o numero do contato que deseja adicionar:");
        String number = scanner.nextLine();
        if (agenda.buscarContato(input) != null) {
            System.out.println("Nome de contato já existe.");
        } else if (agenda.buscarContatoPorNumero(number) != null) {
            System.out.println("Número de contato já usado em outro contato.");
        } else {
            Contato c = new Contato(input, number);
            agenda.adicionarContato(c);
            System.out.println("Contato adicionado com sucesso.");
        }
    }

    public static void removerContatoNaAgenda(AgendaTelefonica agenda) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do contato que deseja remover:");
        String input = scanner.nextLine();
        if (agenda.buscarContato(input) == null) {
            System.out.println("Contato não encontrado.");
        } else {
            agenda.removerContato(input);
            System.out.println("Contato removido com sucesso.");
        }
    }

    public static void buscarContatoNaAgenda(AgendaTelefonica agenda) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do contato que deseja encontrar:");
        String input = scanner.nextLine();
        if (agenda.buscarContato(input) == null) {
            System.out.println("Contato não encontrado.");
        } else {
            Contato c = agenda.buscarContato(input);
            System.out.println("Contato encontrado. Segue as informações do contato.");
            System.out.println("Nome: " + c.getNome());
            System.out.println("Numero: " + c.getNumero_telefone());
        }
    }

    public static void atualizarContatoNaAgenda(AgendaTelefonica agenda) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do contato que deseja atualizar:");
        String input = scanner.nextLine();

        if (agenda.buscarContato(input) == null) {
            System.out.println("Contato não encontrado.");
        } else {
            System.out.println("Digite o novo nome do contato que deseja atualizar:");
            String new_name = scanner.nextLine();
            System.out.println("Digite o novo numero do contato que será atualizado:");
            String number = scanner.nextLine();
            if (agenda.buscarContato(new_name) != null && !Objects.equals(input, new_name)) {
                System.out.println("Nome de contato já usado em outro contato");
            } else if (agenda.buscarContatoPorNumero(number) != null
                    && !Objects.equals(agenda.buscarContato(input).getNumero_telefone(), number)
                    ) {
                System.out.println("Número de contato já usado em outro contato.");
            } else {
                Contato c = new Contato(new_name, number);
                agenda.atualizarContato(input, c);
                System.out.println("Contato atualizado com sucesso.");
            }
        }
    }

    public static void listarContatoNaAgenda(AgendaTelefonica agenda) {
        List<Contato> lista = agenda.getlistaContatos();
        for (Contato contato: lista) {
            System.out.println("------------------------------------------");
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Numero: " + contato.getNumero_telefone());
        }
    }
}