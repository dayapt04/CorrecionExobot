import EjercitoRuso.JSExpertoEspanol;
import EjercitoRuso.JSExpertoIngles;
import Exoesqueleto.PAExobot;
import InteligenciaArtificial.JSIABot;

public class Whiterun {
    public static void main(String[] args) throws Exception {
JSExpertoEspanol  jsexpertoEspanol = new JSExpertoEspanol("Francisco");
        JSExpertoIngles  jsexpertoIngles = new JSExpertoIngles("Carlos");
        JSIABot iaBot = JSIABot.getjsInstancia("IA-BOT");
        PAExobot ex = new PAExobot(iaBot);
        
            System.out.println("\n------------ESPAÑOL-----------\n");
            System.out.println(" Trasfiriendo a la IABOT conocimientos de español," + " soy el maestro " + jsexpertoEspanol.getNombre());
            System.out.println(ex.jsAprenderFoneticaEspanol());
            System.out.println(ex.jsAprenderGramaticaEspanol());
            System.out.println(ex.jsAprenderLexicoEspanol());
            System.out.println("\n------Conocimientos--------\n");
            ex.jsConocimientoEspanol();
        
            System.out.println("\n------------INGLES----------\n");
            System.out.println(" Trasfiriendo a la IABOT conocimientos de inglés," + " soy el maestro " + jsexpertoIngles.getNombre());
            System.out.println(ex.jsAprenderFoneticaIngles());
            System.out.println(ex.jsAprenderGramaticaIngles());
            System.out.println(ex.jsAprenderLexicoIngles());
            System.out.println("\n------Conocimientos--------\n");
            ex.jsConocimientoIngles();
        
        }

}
