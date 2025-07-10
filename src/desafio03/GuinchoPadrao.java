package desafio03;
import desafio03.simulador.Guincho;
import desafio03.simulador.cargas.TipoGuincho;

public class GuinchoPadrao implements Guincho {
    private TipoGuincho tipo;

    public GuinchoPadrao(TipoGuincho tipo) {
        this.tipo = tipo;
    }

    public TipoGuincho getTipo() {
        return tipo;
    }

    @Override
    public double calcularCustoDeslocamento(TrajetoEntreBairros trajeto) {
        return trajeto.getDistanciaEmKM() * tipo.getTaxa();
    }
}