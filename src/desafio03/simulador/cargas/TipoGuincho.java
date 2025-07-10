package desafio03.simulador.cargas;

public enum TipoGuincho {
    CaminhaoDeCorrenteEGancho(2.00),
    CaminhaoDeReboqueIntegrado(10.00),
    CaminhaoGuinchoDePlataforma(5.00);

    private double taxa;

    TipoGuincho(double taxa) {
        this.taxa = taxa;
    }
    public double getTaxa() {
        return taxa;
    }
}