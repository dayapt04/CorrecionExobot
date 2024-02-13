package Exoesqueleto;

public abstract class PAArmaIzquierda {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public PAArmaIzquierda(String tipo) {
        this.tipo = tipo;
    }

    public void disparar(int tiempo) throws InterruptedException {
        System.out.println("\n Disparando Arma Izquierda: ");
        for (int i = 0; i < tiempo; i++) {
            System.out.print(" * ");
            Thread.sleep(100);
        }
        System.out.println();
    }
}
