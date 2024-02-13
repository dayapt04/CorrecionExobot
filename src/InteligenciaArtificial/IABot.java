package InteligenciaArtificial;

import java.security.SecureRandom;

public class IABot {
    // Singleton Pattern
    private static IABot instance;
    private static String nombre;

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
