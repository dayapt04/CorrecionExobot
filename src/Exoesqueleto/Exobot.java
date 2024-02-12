package Exoesqueleto;

import EjercitoRuso.LEIHumanoExtremidad;
import InteligenciaArtificial.IABot;

public class Exobot extends IABot implements LEIHumanoExtremidad {
    private LEFuentePoder EfuentePoder;
    private LETurboReactor EturboReactor;
    private LEBrazoDerecho EbrazoDerecho;
    private LEBrazoIzquierdo Ebrazolzquierdo;
    private Pierna EpiernaDerecha;
    private Pierna Epiernalzquierda;

    public Exobot(IABot iaBot) {
        super(iaBot);
        // fuentePoder = new FuentePoder();
        EturboReactor = new LETurboReactor();
        EbrazoDerecho = new LEBrazoDerecho();
        Ebrazolzquierdo = new LEBrazoIzquierdo();
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
