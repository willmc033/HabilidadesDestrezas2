import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declaracion de Variables
        final double impuestoProd;
        byte menu;
        boolean exit= false;
        int prodAgregados = 0;
        int codigoProducto;
        boolean[] estadoProd = new boolean[100];
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
                    estadoProd[prodAgregados]=true;
                    prodAgregados++;
                    break;
                case 2:
                    for (int i =0; i<=prodAgregados;i++){
                        if (estadoProd[i] ==true) {
                            System.out.println("No:" + (i+1)  + " Producto: " + listaProductos[i] + " Precio Base del Producto:" +
                                    " Q" + precioBaseProd[i] + " Precio Con Iva: " + precioConIvaProd[i]
                                    + "Cantidad de Productos: " + cantidadProd[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el Codigo del Producto");
                    scanner.nextLine();
                    codigoProducto = scanner.nextInt()-1;
                    System.out.println("No:" + (codigoProducto+1) + "Producto: "+listaProductos[codigoProducto]+" Precio Base del Producto: Q"+precioBaseProd[codigoProducto]
                            + " Precio Con Iva: "+precioConIvaProd[codigoProducto] + "Cantidad de Productos: "+ cantidadProd[codigoProducto]);
                    System.out.println("Ingrese la nueva cantidad del producto");
                    cantidadProd[codigoProducto] = scanner.nextDouble();
                    System.out.println("********** Cantidad de Producto Actualizada **********");
                    break;
                case 4:
                    String respuesta;
                    System.out.println("Ingrese el Codigo del Producto");
                    codigoProducto = scanner.nextInt()-1;
                    System.out.println("No: " + (codigoProducto+1) + "Producto: "+listaProductos[codigoProducto]+" Precio Base del Producto: Q"+precioBaseProd[codigoProducto]
                            + " Precio Con Iva: "+precioConIvaProd[codigoProducto] + "Cantidad de Productos: "+ cantidadProd[codigoProducto]);
                    System.out.println("Desea Eliminar el producto D:?  S/N");
                    scanner.nextLine();
                    respuesta = scanner.nextLine();
                    if (respuesta.equalsIgnoreCase("S")){
                        listaProductos[codigoProducto] = "null";
                        precioBaseProd[codigoProducto] = 0;
                        precioConIvaProd[codigoProducto] = 0;
                        cantidadProd[codigoProducto] = 0;
                        estadoProd[codigoProducto]=false;
                        System.out.println("Producto borrado Exitosamente :)");
                    }
                    System.out.println(respuesta);
                    break;
                case 5:

                    exit = true;
                    break;
            }
        }while (!exit);
    }
}