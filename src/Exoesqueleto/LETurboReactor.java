package Exoesqueleto;

public class LETurboReactor {
    public static int leNivelDeEnergia;

    public LETurboReactor() {
        leNivelDeEnergia = 100;
    }

    public int getleNivelDeEnergia() {
        return leNivelDeEnergia;
    }

    public void setleNivelDeEnergia(int leNivelDeEnergia) {
        this.leNivelDeEnergia = leNivelDeEnergia;
    }

    public void leVolar() {
        for (int porcentajeBateria = 100; porcentajeBateria >= 0; porcentajeBateria--) {
            System.out.print("\r -->  Exobot Volando...");
            System.out.println(" -> batería al " + porcentajeBateria + "%");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
