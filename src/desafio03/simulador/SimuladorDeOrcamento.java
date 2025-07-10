package desafio03.simulador;
import desafio03.TrajetoEntreBairros;
import desafio03.VeiculoPadrao;

public interface SimuladorDeOrcamento {
    double calcularCustoTotal(VeiculoPadrao veiculo, TrajetoEntreBairros trajeto);
}