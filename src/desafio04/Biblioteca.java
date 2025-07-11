package desafio04;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor) {
        if (checarExistenciaLivro(titulo, autor)) {
            throw new RuntimeException("Livro já existe na bibloteca.");
        } else {
            Livro l = new Livro(titulo, autor);
            livros.add(l);
        }
    }

    public void emprestarLivro(String titulo, String autor) {
        if (!checarExistenciaLivro(titulo, autor)) {
            throw new RuntimeException("Livro não existe na biblioteca.");
        } else if (!checarDisponibilidadeLivro(titulo, autor)) {
            throw new RuntimeException("Livro já emprestado foi emprestado anteriormente.");
        } else {
            for (Livro livro: livros) {
                if (livro.temTituloEAutor(titulo, autor)) {
                    livro.setDisponivel(false);
                }
            }
        }
    }

    public void devolverLivro(String titulo, String autor) {
        if (!checarExistenciaLivro(titulo, autor)) {
            throw new RuntimeException("Livro não existe na biblioteca.");
        } else if (checarDisponibilidadeLivro(titulo, autor)) {
            throw new RuntimeException("Livro não pode ser devolvido visto que nunca foi emprestado.");
        } else {
            for (Livro livro: livros) {
                if (livro.temTituloEAutor(titulo, autor)) {
                    livro.setDisponivel(true);
                }
            }
        }
    }

    public boolean checarExistenciaLivro(String titulo, String autor) {
        for (Livro livro: livros) {
            if (livro.temTituloEAutor(titulo, autor)) {
                return true;
            }
        }
        return false;
    }

    public boolean checarDisponibilidadeLivro(String titulo, String autor) {
        for (Livro livro : livros) {
            if (livro.temTituloEAutor(titulo, autor) && livro.isDisponivel()) {
                return true;
            }
        }
        return false;
    }
}