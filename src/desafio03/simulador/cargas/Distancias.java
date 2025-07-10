package desafio03.simulador.cargas;

public enum Distancias {
    CParaC(5),
    AParaB(8),
    CParaA(10),
    CParaB(15);

    private int km;

    Distancias(int km) {
        this.km = km;
    }
    public int getKm() {
        return km;
    }
}
