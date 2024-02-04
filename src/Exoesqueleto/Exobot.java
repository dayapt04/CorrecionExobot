package Exoesqueleto;

import EjercitoRuso.IHumanoExtremidad;
import InteligenciaArtificial.IABot;

public class Exobot extends IABot implements IHumanoExtremidad {
    private FuentePoder EfuentePoder;
    private TurboReactor EturboReactor;
    private BrazoDerecho EbrazoDerecho;
    private BrazoIzquierdo Ebrazolzquierdo;
    private Pierna EpiernaDerecha;
    private Pierna Epiernalzquierda;

    public Exobot(IABot iaBot) {
        super(iaBot);
        // fuentePoder = new FuentePoder();
        EturboReactor = new TurboReactor();
        EbrazoDerecho = new BrazoDerecho();
        Ebrazolzquierdo = new BrazoIzquierdo();
        EpiernaDerecha = new Pierna();
        Epiernalzquierda = new Pierna();

        if (Exobot.brazoDerecho)
            System.out.println("Brazo Derecho");
        if (Exobot.brazolzquierdo)
            System.out.println("Brazo Izquierdo");
        if (Exobot.piernaDerecha)
            System.out.println("Pierna derecha");
        if (Exobot.piernalzquierda)
            System.out.println("Pierna izquierda");
        if (Exobot.cabeza)
            System.out.println("Cabeza");
        if (Exobot.tronco)
            System.out.println("Tronco");

    }

    // El Exobot se inicializa solo cuando el iabot le otorga un código de
    // seguridad.
    public Boolean inicializar() {
        return true;
    }
}
