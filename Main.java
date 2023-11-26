import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarroFacade carroFacade = new CarroFacade();
        int opc = 0;

        do {
            System.out.println("----------------------------------- \n" +
                    "Fabrica de carros" +
                    " \nIngrese la operación que quiere realizar: " +
                    " \n -----------------------------------" +
                    " \n 1. Crear un carro " +
                    " \n 2. Salir" +
                    " \n -----------------------------------");

            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre del carro");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la marca del carro");
                    String marca = sc.nextLine();
                    System.out.println("Ingrese el modelo del carro");
                    String modelo = sc.nextLine();
                    System.out.println("Ingrese el color del carro");
                    String color = sc.nextLine();
                    System.out.println("Ingrese la marca del radio del carro");
                    String nombreRadio = sc.nextLine();
                    System.out.println("Ingrese la marca de llantas del carro");
                    String llantas = sc.nextLine();

                    Automovil automovil = carroFacade.crearAutomovil(nombre, marca, modelo, color, llantas);
                    Radio radio = carroFacade.crearRadio(nombreRadio);

                    System.out.println("----------------------------------- \n " +
                            "El carro fabricado es: \n Nombre: " + nombre + " \n Marca: " + marca + "\n Modelo: " + modelo +
                            "\n Color: " + color + "\n Radio: " + nombreRadio + "\n Llantas: " + llantas + "\n----------------------------------- \n");

                    int opc1 = 0;
                    do {
                        System.out.println("----------------------------------- \n " +
                                "Seleccione una función a realizar" +
                                "\n -----------------------------------" +
                                "\n 1. Encender " +
                                "\n 2. Arrancar " +
                                "\n 3. Detener " +
                                "\n 4. Apagar " +
                                "\n 5. Salir" +
                                "\n -----------------------------------");

                        opc1 = Integer.parseInt(sc.nextLine());
                        carroFacade.operarAutomovil(automovil, opc1);
                    } while (opc1 != 5);
                    break;
                case 2:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción Inválida");
                    break;
            }
        } while (opc != 2);

        sc.close();
    }
}
