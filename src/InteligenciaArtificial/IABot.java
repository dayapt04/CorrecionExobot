package InteligenciaArtificial;

public class IABot {
    // Singleton Pattern
    private static IABot instance;
    private static String nombre;

    // hacer el constructor privado para evitar la inicializado
    private IABot() {
    }

    protected IABot(IABot iaBot) {
        if (iaBot != null)
            instance = iaBot;
    }

    public static IABot getInstance(String nombre) {
        if (instance == null) {
            instance = new IABot();
            instance.setNombre(nombre);
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        IABot.nombre = nombre;
    }

    public IABot(String nombre) {
        IABot.nombre = nombre;
    }
}
