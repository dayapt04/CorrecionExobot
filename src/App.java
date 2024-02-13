import EjercitoRuso.LESoldado;
import Exoesqueleto.PAExobot;
import InteligenciaArtificial.JSIABot;

public class App {
    public static void main(String[] args) throws Exception {
        // IABot iaBot = IABot.getInstance("Ana");
        // IABot iaBot2 = IABot.getInstance("Pepe");
        // IABot iaBot3 = IABot.getInstance("Juan");
        JSIABot iaBot = JSIABot.getInstance("Ana");
        PAExobot e1 = new PAExobot(iaBot);
        PAExobot e2 = new PAExobot(iaBot);
        PAExobot e3 = new PAExobot(iaBot);
        LESoldado s1 = new LESoldado("Juan");
        LESoldado s2 = new LESoldado("Maria");

        System.out.println(e1.getNombre());
        System.out.println(e2.getNombre());
        System.out.println(e3.getNombre());

    }
}
