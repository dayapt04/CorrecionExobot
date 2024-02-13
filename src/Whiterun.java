import java.util.Scanner;

import EjercitoRuso.Soldado;
import Exoesqueleto.PAExobot;
import Exoesqueleto.PAFuentePoder;
import InteligenciaArtificial.IABot;

public class Whiterun {
    Scanner sc = new Scanner(System.in);

    public void iniciar() throws InterruptedException {

        IABot iabot = new IABot("IA-Whiterun");
        int nroPeloton = 5;
        int nroSoldado = 1;
        for (int contadorPelotones = 1; contadorPelotones <= nroPeloton; contadorPelotones++) {
            for (int contadorSoldados = 0; contadorSoldados < 5; contadorSoldados++) {
                System.out.println("\n[P E L O T Ó N]: " + contadorPelotones);
                String idSoldado = "[S O L D A D O] " + (nroSoldado);
                nroSoldado++;
                PAExobot exobot = new PAExobot(iabot);
                Soldado s = new Soldado(idSoldado);
                presentarSoldado(s, exobot, iabot);
            }
        }

    }

    public void presentarSoldado(Soldado s, PAExobot e, IABot iaBot) throws InterruptedException {
        PAFuentePoder fuentePoder = new PAFuentePoder();
        e.inicializar(iaBot.PAgenerarCodigoInicializacion());
        e.PAunirSoldado(s);
        System.out.println();
        System.out.print("Prueba de funcionamiento de armas: ");
        e.paDispararArma();
        System.out.println();
        e.paCorrer(200);
        System.out.println();
        e.paSaltar(50);
        System.out.println();
        e.paRecargarFuentePoder(fuentePoder);
        System.out.println();
        System.out.print("Presione cualquier tecla para continuar con el siguiente Soldado...");
        sc.nextLine();
        limpiarConsola();
    }

    public void limpiarConsola() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
        }
    }
}
