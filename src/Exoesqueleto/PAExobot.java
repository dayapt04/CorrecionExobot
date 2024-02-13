package Exoesqueleto;

import EjercitoRuso.LEIHumanoExtremidad;
import InteligenciaArtificial.JSIABot;

public class PAExobot extends JSIABot implements LEIHumanoExtremidad {
    private PAFuentePoder EfuentePoder;
    private PATurboReactor EturboReactor;
    private PABrazoDerecho EbrazoDerecho;
    private PABrazoIzquierdo Ebrazolzquierdo;
    private PAPierna EpiernaDerecha;
    private PAPierna Epiernalzquierda;

    public PAExobot(JSIABot iaBot) {
        super(iaBot);
        // fuentePoder = new FuentePoder();
        EturboReactor = new PATurboReactor();
        EbrazoDerecho = new PABrazoDerecho();
        Ebrazolzquierdo = new PABrazoIzquierdo();
        EpiernaDerecha = new PAPierna();
        Epiernalzquierda = new PAPierna();

        if (PAExobot.brazoDerecho)
            System.out.println("Brazo Derecho");
        if (PAExobot.brazolzquierdo)
            System.out.println("Brazo Izquierdo");
        if (PAExobot.piernaDerecha)
            System.out.println("Pierna derecha");
        if (PAExobot.piernalzquierda)
            System.out.println("Pierna izquierda");
        if (PAExobot.cabeza)
            System.out.println("Cabeza");
        if (PAExobot.tronco)
            System.out.println("Tronco");

    }

    // El Exobot se inicializa solo cuando el iabot le otorga un código de
    // seguridad.
    public Boolean inicializar() {
        return true;
    }
}
