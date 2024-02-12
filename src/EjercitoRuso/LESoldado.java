package EjercitoRuso;

import Exoesqueleto.LEFuentePoder;
import Exoesqueleto.LETurboReactor;

public class LESoldado extends Humano implements LEIHumanoExtremidad {
    private Boolean leHabilidaBrazoIzquierdo;
    private Boolean leHabilidaBrazoDererecho;

    public LESoldado(String nombre) {
        super(nombre);

        if (LESoldado.brazoDerecho)
            setleHabilidaBrazoDererecho(getHabilidad());
        System.out.println(" > Brazo Derecho : " + getleHabilidaBrazoDerecho());
        if (LESoldado.brazolzquierdo)
            setleHabilidaBrazoIzquierdo(getHabilidad());
        System.out.println(" > Brazo Izquierdo : " + getleHabilidaBrazoIzquierdo());
    }

    private boolean getHabilidad() {
        int bias = 50;
        return (Math.random() * 100 < bias);
    }

    public Boolean getleHabilidaBrazoIzquierdo() {
        return leHabilidaBrazoIzquierdo;
    }

    public void setleHabilidaBrazoIzquierdo(Boolean leHabilidaBrazoIzquierdo) {
        this.leHabilidaBrazoIzquierdo = leHabilidaBrazoIzquierdo;
    }

    public Boolean getleHabilidaBrazoDerecho() {
        return leHabilidaBrazoDererecho;
    }

    public void setleHabilidaBrazoDererecho(Boolean leHabilidaBrazoDererecho) {
        this.leHabilidaBrazoDererecho = leHabilidaBrazoDererecho;
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
