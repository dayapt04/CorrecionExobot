import java.util.Scanner;

import EjercitoRuso.LESoldado;
import Exoesqueleto.PAExobot;
import Exoesqueleto.PAFuentePoder;
import InteligenciaArtificial.JSIABot;

public class Whiterun {
    Scanner sc = new Scanner(System.in);

    public void iniciar() throws InterruptedException {

        JSIABot iaBot = JSIABot.getjsInstancia("IA-BOT");

        int nroPeloton = 5;
        int nroSoldado = 1;
        for (int contadorPelotones = 1; contadorPelotones <= nroPeloton; contadorPelotones++) {
            for (int contadorSoldados = 0; contadorSoldados < 5; contadorSoldados++) {
                System.out.println("\n[P E L O T Ó N]: " + contadorPelotones);
                String idSoldado = "[S O L D A D O] " + (nroSoldado);
                nroSoldado++;
                PAExobot exobot = new PAExobot(iaBot);
                LESoldado s = new LESoldado(idSoldado);
                presentarSoldado(s, exobot, iaBot);
            }
        }

    }

    public void presentarSoldado(LESoldado s, PAExobot e, JSIABot iaBot) throws InterruptedException {
        PAFuentePoder fuentePoder = new PAFuentePoder();
        // ensamblaje mecatronico
        // conocimientos tecnicos (exobot ha aprendido x idioma)
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
