package EjercitoRuso;

public class Soldado extends Humano implements IHumanoExtremidad {
    private Boolean habilidaBrazoIzquierdo;
    private Boolean habilidaBrazoDererecho;

    public Soldado(String nombre) {
        super(nombre);
        System.out.println("\n\t -" + nombre + "-");
        if (Soldado.brazolzquierdo)
            setHabilidaBrazoIzquierdo(getHabilidad());
        System.out.println("Habilidad en Brazo Izquierdo: " + getHabilidaBrazoIzquierdo());
        if (Soldado.brazoDerecho)
            setHabilidaBrazoDererecho(getHabilidad());
        System.out.println("Habilidad en Brazo Derecho: " + getHabilidaBrazoDererecho());
    }

    boolean getHabilidad() {
        int bias = 50;
        return (Math.random() * 100 < bias);
    }

    public Boolean getHabilidaBrazoIzquierdo() {
        return habilidaBrazoIzquierdo;
    }

    public void setHabilidaBrazoIzquierdo(Boolean habilidaBrazoIzquierdo) {
        this.habilidaBrazoIzquierdo = habilidaBrazoIzquierdo;
    }

    public Boolean getHabilidaBrazoDererecho() {
        return habilidaBrazoDererecho;
    }

    public void setHabilidaBrazoDererecho(Boolean habilidaBrazoDererecho) {
        this.habilidaBrazoDererecho = habilidaBrazoDererecho;
    }
}
