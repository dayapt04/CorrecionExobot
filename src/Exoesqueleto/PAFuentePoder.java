package Exoesqueleto;

public class PAFuentePoder {
    private int nivelEnergia;

    public void recargar() {
        System.out.println("Se está recargando la Fuente de Poder...");
        String bar[] = { "\\", "|", "/", "-", "|" };

        for (int i = 0; i <= 100; i++) {
            String c = bar[i % 5];
            System.out.print("\r" + c + " " + i + " %");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}