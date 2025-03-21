import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Lista de Productos
        List<String> productos = new ArrayList<>();
        productos.add("Producto 1");
        System.out.println(productos.get(0));

        //Declaracion de Variables
        byte menu;
        boolean exit= false;



        //Menu Principal
        do {
            System.out.println("******* Opciones *******");
            System.out.println("1. Agregar Producto.");
            System.out.println("2. Mostrar Productos.");
            System.out.println("3. Actualizar cantidad de un Producto.");
            System.out.println("4. Eliminar Producto");
            System.out.println("5. Salir");
            menu = scanner.nextByte();

            switch (menu) {
                case 1:
                    System.out.println("Caso 1");
                    break;
                case 2:
                    System.out.println("Caso 2");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    exit = true;
                    break;
            }
        }while (exit == false);
    }
}