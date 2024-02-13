package InteligenciaArtificial;

import java.security.SecureRandom;

public class JSIABot {
    // Singleton Pattern
    private static JSIABot instance;
    private static String nombre;

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

    public String PAgenerarCodigoInicializacion() {
        SecureRandom idExobot = new SecureRandom();
        String caracteresPosibles = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder builder = new StringBuilder(4);
        for (int i = 0; i < 4; i++) {
            int pos = idExobot.nextInt(caracteresPosibles.length());
            builder.append(caracteresPosibles.charAt(pos));
        }
        return builder.toString().toUpperCase();
    }
}
