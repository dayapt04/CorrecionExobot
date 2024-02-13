package EjercitoRuso;
import Exoesqueleto.JSITecnicoEspanol;


public class JSExpertoEspanol extends JSHumano{

    public JSExpertoEspanol(String jsNombre){
        super(jsNombre);
    }
    public void jsTrasferirLexicoEspanol(JSITecnicoEspanol jsExoBot) {
        jsExoBot.jsAprenderLexicoEspanol();
    }

    public void jsTrasferirGramaticaEspanol(JSITecnicoEspanol jsexoBot) {
        jsexoBot.jsAprenderGramaticaEspanol();
    }

    public void jsTrasferirFoneticaEspanol(JSITecnicoEspanol jsexoBot) {
        jsexoBot.jsAprenderFoneticaEspanol();

    }
    public String getNombre() {
        return getJsNombre();

}
}