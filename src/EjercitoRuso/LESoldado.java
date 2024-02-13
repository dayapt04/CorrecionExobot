package EjercitoRuso;

import Exoesqueleto.LEArmaBazucaI;
import Exoesqueleto.LEArmaLaserD;
import Exoesqueleto.LEArmaMetralletaI;
import Exoesqueleto.LEBrazoDerecho;
import Exoesqueleto.LEBrazoIzquierdo;
import Exoesqueleto.LEFuentePoder;
import Exoesqueleto.LETurboReactor;

public class LESoldado extends Humano implements LEIHumanoExtremidad {
    private Boolean leHabilidadBrazoIzquierdo;
    private Boolean leHabilidadBrazoDererecho;

    public LESoldado(String nombre) {
        super(nombre);

        if (LESoldado.brazoDerecho)
            setleHabilidadBrazoDererecho(getHabilidad());
        System.out.println(" > Brazo Derecho : " + getleHabilidadBrazoDerecho());
        if (LESoldado.brazolzquierdo)
            setleHabilidadBrazoIzquierdo(getHabilidad());
        System.out.println(" > Brazo Izquierdo : " + getleHabilidadBrazoIzquierdo());
    }

    private boolean getHabilidad() {
        int bias = 50;
        return (Math.random() * 100 < bias);
    }

    public Boolean getleHabilidadBrazoIzquierdo() {
        return leHabilidadBrazoIzquierdo;
    }

    public void setleHabilidadBrazoIzquierdo(Boolean leHabilidadBrazoIzquierdo) {
        this.leHabilidadBrazoIzquierdo = leHabilidadBrazoIzquierdo;
    }

    public Boolean getleHabilidadBrazoDerecho() {
        return leHabilidadBrazoDererecho;
    }

    public void setleHabilidadBrazoDererecho(Boolean leHabilidadBrazoDererecho) {
        this.leHabilidadBrazoDererecho = leHabilidadBrazoDererecho;
    }

    public void leReemplazarBateriaTurboReactor(LETurboReactor elTurboReactor) {
        System.out.println(" [] Recargando -- reemplazando batería.");
        LETurboReactor.leNivelDeEnergia = 100;
    }

    public void leReemplazarBateriaFuente(LEFuentePoder elFuentePoder) {
        System.out.println(" [] Recargando -- reemplazando batería.");
        LEFuentePoder.leNivelEnergia = 100;
    }

    
}
