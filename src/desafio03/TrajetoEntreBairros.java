package desafio03;
import desafio03.simulador.Trajeto;

public class TrajetoEntreBairros implements Trajeto{
    private int distanciaEmKM;

    public TrajetoEntreBairros(int distanciaEmKM) {
        this.distanciaEmKM = distanciaEmKM;
    }

    @Override
    public Integer getDistanciaEmKM() {
        return distanciaEmKM;
    }
}
