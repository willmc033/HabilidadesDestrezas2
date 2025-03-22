import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declaracion de Variables
        byte menu;
        boolean exit= false;
        final double impuestoProd;
        int prodAgregados = 1;
        String[] listaProductos = new String[100];
        double[] precioBaseProd = new double[100];
        double[] precioConIvaProd = new double[100];
        double[] cantidadProd = new double[100];

        //Definiendo Impuesto del producto
        System.out.println("Ingreso el Impuesto a aplicar al producto");
        impuestoProd = scanner.nextDouble()/100;

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
                    System.out.println(prodAgregados);
                    System.out.println("Ingrese el Producto");
                    scanner.nextLine();
                    listaProductos[prodAgregados] = scanner.nextLine();
                    System.out.println("Precio Base Producto");
                    precioBaseProd[prodAgregados] = scanner.nextDouble();
                    System.out.println("Cantidad de Productos");
                    cantidadProd[prodAgregados] = scanner.nextDouble();
                    precioConIvaProd[prodAgregados] = precioBaseProd[prodAgregados] * impuestoProd + precioBaseProd[prodAgregados];
                    prodAgregados++;
                    break;
                case 2:
                    for (int i =0; i<prodAgregados;i++){
                        System.out.println("No:" + i+1+ "Producto: "+listaProductos[i+1]+" Precio Base del Producto: Q"+precioBaseProd[i+1]
                                + " Precio Con Iva: "+precioConIvaProd[i+1] + "Cantidad de Productos: "+ cantidadProd[i+1]);
                    }
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