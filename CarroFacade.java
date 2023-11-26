public class CarroFacade {
    public Automovil crearAutomovil(String nombre, String marca, String modelo, String color, String llantas) {
        return new Automovil(nombre, marca, modelo, color, llantas);
    }

    public Radio crearRadio(String nombre) {
        return new Radio(nombre);
    }

    public void operarAutomovil(Automovil automovil, int opcion) {
        switch (opcion) {
            case 1:
                automovil.encender();
                break;
            case 2:
                automovil.arrancar();
                break;
            case 3:
                automovil.detener();
                break;
            case 4:
                automovil.apagar();
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
}
