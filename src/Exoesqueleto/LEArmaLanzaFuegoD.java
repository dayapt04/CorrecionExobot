package Exoesqueleto;

public class LEArmaLanzaFuegoD implements LEIArmaDerecha {
    private String leTipo;

    public LEArmaLanzaFuegoD(String leTipo) {
        this.leTipo = leTipo;
    }

    @Override
    public void leDispararArmaDerecha(int leCantidadBalas) {
        System.out.println(" -> Disparando arma derecha: ");
        for (int i = 0; i < leCantidadBalas; i++) {

            System.out.print(" * ");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return this.leTipo + "\n";
    
    }
}
