import java.util.Scanner;

import EjercitoRuso.JSExpertoEspanol;
import EjercitoRuso.JSExpertoIngles;
import EjercitoRuso.LESoldado;
import EjercitoRuso.LZMecatronico;
import Exoesqueleto.PAExobot;
import Exoesqueleto.PAFuentePoder;
import InteligenciaArtificial.JSIABot;



public class Whiterun {
    Scanner sc = new Scanner(System.in);

    public void iniciar() throws InterruptedException {

        JSIABot iaBot = JSIABot.getjsInstancia("IA-BOT");

        int nroPeloton = 5;
        int nroSoldado = 1;
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println(" El programa 'ExoBot' ha sido creado como parte de una estrategia de preparación de Rusia para \nenfrentarse en la guerra contra Ucrania.");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t¡BIENVENIDOS A WHITERUN!");
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
        LZMecatronico lzMecatronico = new LZMecatronico("Pat-Mic");
        lzMecatronico.ensamblarExobot(s, e, iaBot);

        JSExpertoEspanol  jsexpertoEspanol = new JSExpertoEspanol("Francisco");
        JSExpertoIngles  jsexpertoIngles = new JSExpertoIngles("Carlos");
        System.out.println("\n------------ESPAÑOL-----------\n");
            System.out.println(" Trasfiriendo a la IABOT conocimientos de español," + " soy el maestro " + jsexpertoEspanol.getNombre());
            System.out.println(e.jsAprenderFoneticaEspanol());
            System.out.println(e.jsAprenderGramaticaEspanol());
            System.out.println(e.jsAprenderLexicoEspanol());
            System.out.println("\n------Conocimientos--------\n");
            e.jsConocimientoEspanol();
       
            System.out.println("\n------------INGLES----------\n");
            System.out.println(" Trasfiriendo a la IABOT conocimientos de inglés," + " soy el maestro " + jsexpertoIngles.getNombre());
            System.out.println(e.jsAprenderFoneticaIngles());
            System.out.println(e.jsAprenderGramaticaIngles());
            System.out.println(e.jsAprenderLexicoIngles());
            System.out.println("\n------Conocimientos--------\n");
            e.jsConocimientoIngles();
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
