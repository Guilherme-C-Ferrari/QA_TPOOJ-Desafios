package desafio01;
import java.util.Map;

public class Cardapio {
    private static final Map<Integer, Produto> produtos = Map.of(
            1, new Produto(1, "Café", 53.00),
            2, new Produto(2, "Sabão", 36.00),
            3, new Produto(3, "Leite", 82.00),
            4, new Produto(4, "Refrigerante", 8.50)
    );

    public static Produto getProdutos(int id) {
        return produtos.get(id);
    }
}