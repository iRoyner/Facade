public class Dispositivo {

    private String nombre;
    private String referencia;

    public Dispositivo() {
    }
    public Dispositivo(String nombre) {
        this.nombre = nombre;
    }

    public Dispositivo(String nombre, String referencia) {
        this.nombre = nombre;
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
