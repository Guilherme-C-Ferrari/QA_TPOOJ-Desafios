package desafio03;
import desafio03.simulador.cargas.Distancias;
import desafio03.simulador.cargas.EstadoConservacao;
import desafio03.simulador.cargas.TipoVeiculo;

public class Main {
    public static void main(String[] args) {
        // Cenário 1 -  carro novo - do centro para o bairro A

        // Instanciar implementação de simulador
        SimuladorDeOrcamentoPadrao simulador = new SimuladorDeOrcamentoPadrao();

        // Instanciar implementação de veiculo
        VeiculoPadrao carroNovo = new VeiculoPadrao(TipoVeiculo.CARRO, EstadoConservacao.NOVO);

        // Instanciar trajeto
        TrajetoEntreBairros centroParaBairroA = new TrajetoEntreBairros(Distancias.CParaA.getKm());

        double custoCenario1 = simulador.calcularCustoTotal(carroNovo, centroParaBairroA);
        System.out.println("Cenário 1 - Custo Total do Serviço: R$" + custoCenario1);
    }
}