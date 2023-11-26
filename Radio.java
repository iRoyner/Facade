public class Radio extends Dispositivo implements FuncionesDispositivo{

    public Radio(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        System.out.println("El radio esta encendido");

    }

    @Override
    public void apagar() {
        System.out.println("El radio esta apagado");

    }
}
