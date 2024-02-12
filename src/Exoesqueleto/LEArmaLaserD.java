package Exoesqueleto;

public class LEArmaLaserD implements LEIArmaDerecha  {
    private String leTipo;

    public LEArmaLaserD(String leTipo) {
        this.leTipo = leTipo;
    }

    @Override
    public String toString() {
        return this.leTipo + "\n";

    }

    @Override
    public void leDispararArmaDerecha(int leNumeroBalas) {
        System.out.println(" -> Disparando arma derecha: ");
        for (int i = 0; i < leNumeroBalas; i++) {
            System.out.print(" * ");
        try {
        Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    System.out.println(" ");
    }
}