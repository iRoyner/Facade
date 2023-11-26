public class Automovil extends Carro implements Funciones {

    public Automovil() {
    }

    public Automovil(String nombre, String marca, String modelo, String color, String Llantas) {
        super(nombre, marca, modelo, color, Llantas);
    }

    @Override
    public void encender() {
        System.out.println("El carro se encendió. ");

    }

    @Override
    public void arrancar() {
        System.out.println("El carro se arrancó.");
    }

    @Override
    public void detener() {
        System.out.println("El carro se detuvo.");

    }

    @Override
    public void apagar() {
        System.out.println("El carro se apagó.");

    }

}
