import EjercitoRuso.Soldado;
import Exoesqueleto.PAExobot;
import Exoesqueleto.PAFuentePoder;
import InteligenciaArtificial.IABot;

public class Whiterun {
    public void iniciar() {
        Soldado s1 = new Soldado("Arthur");
        IABot iabot = new IABot("IA-Whiterun");
        PAExobot e1 = new PAExobot(iabot);
        PAFuentePoder fuentePoder = new PAFuentePoder();

        e1.inicializar(iabot.PAgenerarCodigoInicializacion());
        e1.PAunirSoldado(s1);
        e1.paCorrer(100);
        e1.paSaltar(50);
        e1.paRecargarFuentePoder(fuentePoder);
    }
}
