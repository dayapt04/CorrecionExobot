package Exoesqueleto;

public abstract class PAArmaDerecha {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public PAArmaDerecha(String tipo) {
        this.tipo = tipo;
    }

    static String Reset = "\u001b[0m";
    static String naranja = "\u001b[38;5;202m";

    public void paDisparar(int tiempo) throws InterruptedException {
        System.out.println("\n Disparando Arma Derecha: ");
        for (int i = 0; i < tiempo; i++) {
            System.out.print(naranja+"==="+Reset);
            Thread.sleep(100);
        }
        System.out.println();
    }
}
