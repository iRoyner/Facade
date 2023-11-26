public class Carro {

    private String nombre;
    private String marca;
    private String modelo;
    private String color;
    private String llantas;

    public Carro() {
    }

    public Carro(String nombre, String marca, String modelo, String color, String llantas) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.llantas = color;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getLlantas() {
        return this.llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }
}
