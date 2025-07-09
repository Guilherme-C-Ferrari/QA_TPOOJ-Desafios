package desafio01;

public class CaixaDoAtacado {
    public double computarCompra(String input) {
        double valor_final = 0;
        String[] linhas = input.strip().split("\\r?\\n");
        String metodo_pagamento = linhas[0].toLowerCase();

        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(",");
            int id = Integer.parseInt(partes[0].trim());
            int unidades = Integer.parseInt(partes[1].trim());

            Produto p = Cardapio.getProdutos(id);
            if (p != null) {
                valor_final += calcularValorConjuntoItem(p.getPreco(), unidades);
            }
        }

        valor_final = aplicarDescontoPorMetodo(valor_final, metodo_pagamento);
        return valor_final;
    }

    public double calcularValorConjuntoItem(double valor_item, int unidades) {
        return valor_item * unidades * calcularDescontoPorUnidade(unidades);
    }

    public double calcularDescontoPorUnidade(int unidades) {
        if (unidades < 5) {
            return 1;
        } else if (unidades < 15) {
            return 0.9;
        } else if (unidades < 25) {
            return 0.8;
        } else {
            return 0.75;
        }
    }

    public double aplicarDescontoPorMetodo(double valor_total, String metodo) {
        return switch (metodo) {
            case "debito" -> valor_total;
            case "dinheiro" -> valor_total * 0.95;
            case "credito" -> valor_total * 1.03;
            default -> throw new IllegalArgumentException("Método de pagamento inválido: " + metodo);
        };
    }
}
