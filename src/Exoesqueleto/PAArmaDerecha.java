package Exoesqueleto;

public abstract class PAArmaDerecha {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public PAArmaDerecha(String tipo) {
        this.tipo = tipo;
    }

    public void disparar(int tiempo) {
        for (int i = 0; i < tiempo; i++) {
            System.out.println(" * ");
        }
    }
}
