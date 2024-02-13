package EjercitoRuso;
import Exoesqueleto.JSITecnicoIngles;

public class JSExpertoIngles extends JSHumano {

    public JSExpertoIngles(String jsNombre){
        super(jsNombre);
    }
    public void jsTrasferirLexicoIngles(JSITecnicoIngles jsExoBot) {
        jsExoBot.jsAprenderLexicoIngles();
    }

    public void jsTrasferirGramaticaIngles(JSITecnicoIngles jsexoBot) {
        jsexoBot.jsAprenderGramaticaIngles();
    }

    public void jsTrasferirFoneticaIngles(JSITecnicoIngles jsexoBot) {
        jsexoBot.jsAprenderFoneticaIngles();

    }
    public String getNombre() {
        return getJsNombre();
}
}
