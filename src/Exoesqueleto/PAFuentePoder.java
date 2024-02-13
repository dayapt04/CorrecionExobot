package Exoesqueleto;

public class PAFuentePoder {
    static String morado = "\u001b[38;5;213m";
    static String reset = "\u001b[0m";

    public void recargar() {
        System.out.println(morado+"---------------------------------------------"+reset);
        System.out.println(" -> Se está recargando la Fuente de Poder..."+morado);
        String bar[] = { "\\", "|", "/", "-", "|" };
        
        for (int i = 0; i <= 100; i++) {
            String c = bar[i % 5];
            System.out.print("\r" + c + " " + i + " %");
            
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
            }
        }
        System.out.println();
        System.out.println(morado+"---------------------------------------------"+reset);
    }
}