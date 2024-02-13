package InteligenciaArtificial;

import java.util.Hashtable;

import Exoesqueleto.JSITecnicoEspanol;
import Exoesqueleto.JSITecnicoIngles;


public class JSIABot implements JSITecnicoEspanol, JSITecnicoIngles {
        private static String jsNombre;
        private static JSIABot jsInstancia;
        Hashtable<Integer, String> jsConocimientoI = new Hashtable<>();
        Hashtable<Integer, String> jsConocimientoE = new Hashtable<>();

    
        private JSIABot() {
        }
        //metodo para crear una sola clase papa, para varias clases hijos
        protected JSIABot(JSIABot ia) {
            if (ia != null) {
                jsInstancia = ia;
            }
        }
        //Metodo para inicializar una sola vez el constructor de la clase.
        public static JSIABot getjsInstancia(String jsNombre) {
            if (jsInstancia == null) {
                jsInstancia = new JSIABot();
                JSIABot.jsNombre = jsNombre;
            }
            return jsInstancia;
        }
    
        public String getjsNombre() {
            return jsNombre;
        }
    
        private void setjsNombre(String jsNombre) {
            this.jsNombre = jsNombre;
        }
        
        @Override
        public String jsAprenderLexicoIngles() {
            jsConocimientoI.put(1, " Se ha aprendido correctamente el léxico en inglés.");
            return " Se está recibiendo la transferencia de conocimientos de lexico del inglés.";
        }
    
        @Override
        public String jsAprenderGramaticaIngles() {
            jsConocimientoI.put(2, " Se ha aprendido correctamente la gramática en inglés.");
            return " Se está recibiendo la transferencia de conocimientos de gramática del inglés.";
        }
    
        @Override
        public String jsAprenderFoneticaIngles() {
            jsConocimientoI.put(3, " Se ha aprendido correctamente la fonética en inglés.");
            return " Se está recibiendo la transferencia de conocimientos de fonética del inglés.";
        }
    
        public void jsConocimientoIngles() {
            System.out.println(" Se ha logrado recibir la transferencia de conocimientos en inglés:");
            jsConocimientoI.forEach((k, v) -> {
                System.out.println(v);
            });
        }

        @Override
        public String jsAprenderLexicoEspanol() {
            jsConocimientoE.put(1, " Se ha aprendido correctamente el léxico en español.");
            return " Se está recibiendo la transferencia de conocimientos de léxico del español.";
        }
    
        @Override
        public String jsAprenderGramaticaEspanol() {
            jsConocimientoE.put(2, " Se ha aprendido correctamente la gramática en español.");
            return " Se está recibiendo la transferencia de conocimientos de gramática del español.";
        }
        @Override
        public String jsAprenderFoneticaEspanol() {
            jsConocimientoE.put(3, " Se ha aprendido correctamente la fonética en español.");
            return " Se está recibiendo la transferencia de conocimientos de fonética del español.";
        }
        public void jsConocimientoEspanol() {
            System.out.println(" Se ha logrado recibir la transferencia de conocimientos en español:");
            jsConocimientoE.forEach((k, v) -> {
                System.out.println(v);
            });
        }
    }
    
    
