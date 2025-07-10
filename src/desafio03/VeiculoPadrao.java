package desafio03;
import desafio03.simulador.Veiculo;
import desafio03.simulador.cargas.EstadoConservacao;
import desafio03.simulador.cargas.TipoVeiculo;

public class VeiculoPadrao implements Veiculo {
    private TipoVeiculo tipo;
    private EstadoConservacao estado;

    public VeiculoPadrao(TipoVeiculo tipo, EstadoConservacao estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    @Override
    public TipoVeiculo getTipo() {
        return tipo;
    }

    @Override
    public EstadoConservacao getEstado() {
        return estado;
    }
}
