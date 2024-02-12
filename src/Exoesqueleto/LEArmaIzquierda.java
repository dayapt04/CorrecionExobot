package Exoesqueleto;

public abstract class LEArmaIzquierda {
    private String leTipo;

    public LEArmaIzquierda(String leTipo) {
        this.leTipo = leTipo;
    }

    public String getleTipo() {
        return leTipo;
    }

    public void leDispararArmaIzquierda(int cantidadBalas) throws InterruptedException {
        System.out.println(" ->  Disparando arma Izquierda: ");
        for (int i = 0; i < cantidadBalas; i++) {

            System.out.print(" * ");
            Thread.sleep(50);
        }
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return this.leTipo + "\n";
    }
}

