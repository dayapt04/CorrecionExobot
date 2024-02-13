package EjercitoRuso;


public class LESoldado extends JSHumano implements LEIHumanoExtremidad {
    private Boolean habilidaBrazoIzquierdo;
    private Boolean habilidaBrazoDererecho;

    static String purple = "\u001b[38;5;5m";
    static String Reset = "\u001b[0m";

    public LESoldado(String nombre) {
        super(nombre);
        System.out.println("\n\t -" + nombre + "-");
        if (LESoldado.brazolzquierdo)
            setHabilidaBrazoIzquierdo(getHabilidad());
        System.out.println(purple+" -> Habilidad en Brazo Izquierdo: " + getHabilidaBrazoIzquierdo());
        if (LESoldado.brazoDerecho)
            setHabilidaBrazoDererecho(getHabilidad());
        System.out.println(" -> Habilidad en Brazo Derecho: " + getHabilidaBrazoDererecho() + Reset);
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
