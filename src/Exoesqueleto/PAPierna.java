package Exoesqueleto;

public class PAPierna {

    static String celeste = "\u001b[34;1m";
    static String rosa = "\u001b[38;5;199m";
    static String Reset = "\u001b[0m";

    public void paCorrer(int velocidad) {
        System.out.println(celeste+"[ EXOBOT -> POTENCIAR EXTREMIDADES INFERIORES ]"+Reset);
        if (velocidad >= 1 && velocidad <= 200)
            System.out
                    .println(rosa+" - El soldado está corriendo a una velocidad de " + velocidad + "km/h gracias al [EXOBOT]."+Reset);
        else
            System.out.println("¡ERROR! \n \t No es posible para el [EXOBOT] correr a la velocidad indicada.");
    }

    public void paSaltar(int altitud) {
        System.out.println(celeste+"[ EXOBOT -> POTENCIAR EXTREMIDADES INFERIORES ]"+Reset);
        if (altitud >= 1 && altitud <= 50)
            System.out.println(rosa+"- El soldado salta una altura de " + altitud + "metros gracias al [EXOBOT]."+Reset);
        else
            System.out.println(
                    "¡ERROR! \n \t La altura del salto no puede ser menor o igual a cero ni mayor a 50 metros; el [EXOBOT] no realizó el salto.");
    }
}
