package desafio02;

public class Contato {
    private String nome;
    private String numero_telefone;

    public Contato(String nome, String numero_telefone) {
        this.nome = nome;
        this.numero_telefone = numero_telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero_telefone() {
        return numero_telefone;
    }

    public void setNumero_telefone(String numero_telefone) {
        this.numero_telefone = numero_telefone;
    }
}
