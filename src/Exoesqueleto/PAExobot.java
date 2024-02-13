package Exoesqueleto;

// import javax.imageio.plugins.tiff.ExifInteroperabilityTagSet;

import EjercitoRuso.*;
import InteligenciaArtificial.IABot;

public class PAExobot extends IABot implements IHumanoExtremidad {
    private PAFuentePoder EfuentePoder;
    private PATurboReactor EturboReactor;
    private PABrazoDerecho EbrazoDerecho;
    private PABrazoIzquierdo Ebrazolzquierdo;
    private PAPierna EpiernaDerecha;
    private PAPierna Epiernalzquierda;

    public PAExobot(IABot iaBot) {
        super(iaBot);
        EturboReactor = new PATurboReactor();
        EbrazoDerecho = new PABrazoDerecho();
        Ebrazolzquierdo = new PABrazoIzquierdo();
        EpiernaDerecha = new PAPierna();
        Epiernalzquierda = new PAPierna();
    }

    public void PAunirSoldado(Soldado soldado) {
        if (PAExobot.brazolzquierdo && Ebrazolzquierdo != null)
            System.out.print("\nArma Izquierda: ");
        if (soldado.getHabilidaBrazoIzquierdo()) {
            PAArmaMetralleta m = new PAArmaMetralleta("Metralleta MK61");
            Ebrazolzquierdo.setArmaIzquierda(m);
            System.out.println(m.getTipo() + ".");
        } else {
            PAArmaBazuca b = new PAArmaBazuca("Bazuca Antiataque");
            Ebrazolzquierdo.setArmaIzquierda(b);
            System.out.println(b.getTipo() + ".");
        }

        if (PAExobot.brazoDerecho && EbrazoDerecho != null)
            System.out.print("\nArma Derecha: ");
        if (soldado.getHabilidaBrazoDererecho()) {
            PAArmaLaser laser = new PAArmaLaser("Láser");
            EbrazoDerecho.setArmaDerecha(laser);
            System.out.println(laser.getTipo() + ".");
        } else {
            PAArmaLanzaFuego lanzaFuego = new PAArmaLanzaFuego("LanzaFuego");
            EbrazoDerecho.setArmaDerecha(lanzaFuego);
            System.out.println(lanzaFuego.getTipo() + ".");
        }
    }

    public Boolean inicializar(String codigo) {
        System.out.println("El IABot ha otorgado el código: " + codigo + ".\n\n\t INICIALIZANDO EXOBOT...");
        return true;
    }

    public void paRecargarFuentePoder(PAFuentePoder fuente) {
        if (fuente != null) {
            this.EfuentePoder = fuente;
            EfuentePoder = new PAFuentePoder();
            EfuentePoder.recargar();
            System.out.println("\nLa fuente de poder se ha recargado con éxito.");
        }
    }

    public void paVolar() {
        if (EturboReactor != null) {
            EturboReactor = new PATurboReactor();
            EturboReactor.paVolar();
        }
    }

    public void paSaltar(int altitud) {
        if (EpiernaDerecha != null && Epiernalzquierda != null) {
            EpiernaDerecha = new PAPierna();
            EpiernaDerecha.paSaltar(altitud);
        }
    }

    public void paCorrer(int velocidad) {
        if (EpiernaDerecha != null && Epiernalzquierda != null) {
            EpiernaDerecha = new PAPierna();
            EpiernaDerecha.paCorrer(velocidad);
        }
    }
}
