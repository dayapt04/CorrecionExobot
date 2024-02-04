import EjercitoRuso.Soldado;
import Exoesqueleto.Exobot;
import InteligenciaArtificial.IABot;

public class App {
    public static void main(String[] args) throws Exception {
        // IABot iaBot = IABot.getInstance("Ana");
        // IABot iaBot2 = IABot.getInstance("Pepe");
        // IABot iaBot3 = IABot.getInstance("Juan");
        IABot iaBot = IABot.getInstance("Ana");
        Exobot e1 = new Exobot(iaBot);
        Exobot e2 = new Exobot(iaBot);
        Exobot e3 = new Exobot(iaBot);
        Soldado s1 = new Soldado("Juan");
        Soldado s2 = new Soldado("Maria");

        System.out.println(e1.getNombre());
        System.out.println(e2.getNombre());
        System.out.println(e3.getNombre());

    }
}
