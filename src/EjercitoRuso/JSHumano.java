package EjercitoRuso;

public abstract class JSHumano {
    private String jsNombre;

    public JSHumano(String jsNombre) {
        this.setJsNombre(jsNombre);
    }

    public String getJsNombre() {
        return jsNombre;
        
    }

    public void setJsNombre(String jsNombre) {
        this.jsNombre = jsNombre;
        
    }

    public String GetNombre() {
        return getJsNombre();
    }

    public void SetNombre(String jsNombre) {
        this.setJsNombre(jsNombre);
    }

}
