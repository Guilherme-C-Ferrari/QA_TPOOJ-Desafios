package desafio03;
import desafio03.simulador.SimuladorDeOrcamento;
import desafio03.simulador.cargas.EstadoConservacao;
import desafio03.simulador.cargas.TipoGuincho;
import desafio03.simulador.cargas.TipoVeiculo;

public class SimuladorDeOrcamentoPadrao implements SimuladorDeOrcamento {
    @Override
    public double calcularCustoTotal(VeiculoPadrao veiculo, TrajetoEntreBairros trajeto) {
        GuinchoPadrao guincho;
        if (veiculo.getEstado() == EstadoConservacao.QUEBRADO) {
            guincho = new GuinchoPadrao(TipoGuincho.CaminhaoDeCorrenteEGancho);
            return guincho.calcularCustoDeslocamento(trajeto);
        } else {
            return switch (veiculo.getTipo()) {
                case TipoVeiculo.CARRO, TipoVeiculo.MINIVAN -> {
                    guincho = new GuinchoPadrao(TipoGuincho.CaminhaoGuinchoDePlataforma);
                    yield guincho.calcularCustoDeslocamento(trajeto);
                }
                case TipoVeiculo.ONIBUS, TipoVeiculo.CAMINHAO -> {
                    guincho = new GuinchoPadrao(TipoGuincho.CaminhaoDeReboqueIntegrado);
                    yield guincho.calcularCustoDeslocamento(trajeto);
                }
            };
        }
    }
}