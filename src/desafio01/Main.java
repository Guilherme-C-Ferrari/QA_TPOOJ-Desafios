package desafio01;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, forneça algum input.");
            return;
        }
        String entrada = String.join("\n", args);

        CaixaDoAtacado caixa = new CaixaDoAtacado();
        double valor_compra = caixa.computarCompra(entrada);
        System.out.printf("Total da compra: R$ %.2f\n", valor_compra);
    }
}
