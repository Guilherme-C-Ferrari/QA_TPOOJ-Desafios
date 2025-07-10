package desafio03.simulador;
import desafio03.simulador.cargas.TipoVeiculo;
import desafio03.simulador.cargas.EstadoConservacao;

public interface Veiculo {
    TipoVeiculo getTipo();
    EstadoConservacao getEstado();
}
