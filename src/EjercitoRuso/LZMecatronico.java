package EjercitoRuso;

import java.util.Scanner;

import Exoesqueleto.PAExobot;
import InteligenciaArtificial.JSIABot;

public class LZMecatronico extends JSHumano {

    public LZMecatronico(String nombre) {
        super(nombre);
    }

    Scanner sc = new Scanner(System.in);

    public void ensamblarExobot(LESoldado leSoldado, PAExobot Exobot, JSIABot IaBot) throws InterruptedException {
        int opcionE;
        System.out.println("Emsamblando Exobot, por favor espere");
        for (int i = 0; i <= 100; i++) {
            int nSpacios = 2 - (i % 3);
            String bStatus = "";
            for (int j = 0; j < nSpacios; j++) {
                bStatus += "o";
            }
            bStatus += "0";
            for (int j = 0; j < 2 - nSpacios; j++) {
                bStatus += "o";
            }
            System.out.print(bStatus + " " + i + "%\r");
            Thread.sleep(70);
        }
        System.out.println("Su ExoBot ha sido ensamblado");
        do {
            System.out.println("Desea ver su ExoBot: \n1. Si \n2. No");
            opcionE = sc.nextInt();
            switch (opcionE) {
                case 1:
                    LZDisenoExobot oLzDisenoExobot = new LZDisenoExobot();
                    oLzDisenoExobot.lzVerExabot();
                    opcionE = 2;
                    break;
                case 2:
                    break;
                default:
                    System.out.println("\nOpción no válida.\nPor favor ingrese una opción correcta.");
                    break;
            }
        } while (opcionE != 2);

    }

}
