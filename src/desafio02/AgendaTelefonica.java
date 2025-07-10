package desafio02;
import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private final List<Contato> lista_de_contatos = new ArrayList<>();

    public void adicionarContato(Contato c) {
        lista_de_contatos.add(c);
    }

    public void removerContato(String n) {
        lista_de_contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(n));
    }

    public Contato buscarContato(String n) {
        for (Contato contato: lista_de_contatos) {
            if (contato.getNome().equalsIgnoreCase(n)) {
                return contato;
            }
        }
        return null;
    }

    public void atualizarContato(String n, Contato c) {
        for (int i = 0; i < lista_de_contatos.size(); i++) {
            if (lista_de_contatos.get(i).getNome().equalsIgnoreCase(n)) {
                lista_de_contatos.set(i, c);
                break;
            }
        }
    }

    public void listarContatos() {
        for (Contato contato: lista_de_contatos) {
            System.out.println("------------------------------------------");
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Numero: " + contato.getNumero_telefone());
        }
    }
}
