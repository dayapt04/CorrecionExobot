package Exoesqueleto;

public class PAPierna {

    public void paCorrer(int velocidad) {
        System.out.println("[ EXOBOT -> POTENCIAR EXTREMIDADES INFERIORES ]");
        if (velocidad >= 1 && velocidad <= 200)
            System.out
                    .println("El soldado está corriendo a una velocidad de " + velocidad + "km/h gracias al [EXOBOT].");
        else
            System.out.println("¡ERROR! \n \t No es posible para el [EXOBOT] correr a la velocidad indicada.");
    }

    public void paSaltar(int altitud) {
        System.out.println("[ EXOBOT -> POTENCIAR EXTREMIDADES INFERIORES ]");
        if (altitud >= 1 && altitud <= 50)
            System.out.println("El soldado salta una altura de " + altitud + "metros gracias al [EXOBOT].");
        else
            System.out.println(
                    "¡ERROR! \n \t La altura del salto no puede ser menor o igual a cero ni mayor a 50 metros; el [EXOBOT] no realizó el salto.");
    }
}
