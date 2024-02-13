package InteligenciaArtificial;

public class JSIABot {
    // Singleton Pattern
    private static JSIABot instance;
    private static String nombre;

    // hacer el constructor privado para evitar la inicializado
    private JSIABot() {
    }

    protected JSIABot(JSIABot iaBot) {
        if (iaBot != null)
            instance = iaBot;
    }

    public static JSIABot getInstance(String nombre) {
        if (instance == null) {
            instance = new JSIABot();
            instance.setNombre(nombre);
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        JSIABot.nombre = nombre;
    }

    public JSIABot(String nombre) {
        JSIABot.nombre = nombre;
    }
}
