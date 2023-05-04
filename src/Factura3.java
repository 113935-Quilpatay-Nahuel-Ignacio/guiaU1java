import java.util.Scanner;
//EJERCICIO 3
public class Factura3
{
    public static void main(String[] args)
    {
        //Declaración de scanner y variables a almacenar
        Scanner entrada = new Scanner(System.in);
        double precio1, precio2, precio3;
        int cantidad1, cantidad2, cantidad3;

        //Ingresar datos del artículo 1
        System.out.println("Ingrese el precio unitario del artículo 1: ");
        precio1 = entrada.nextDouble();
        System.out.println("Ingrese la cantidad del artículo 1: ");
        cantidad1 = entrada.nextInt();

        //Artículo 2
        System.out.println("Ingrese el precio unitario del artículo 2: ");
        precio2 = entrada.nextDouble();
        System.out.println("Ingrese la cantidad del artículo 2: ");
        cantidad2 = entrada.nextInt();

        //Artículo 3
        System.out.println("Ingrese el precio unitario del artículo 3: ");
        precio3 = entrada.nextDouble();
        System.out.println("Ingrese la cantidad del artículo 3: ");
        cantidad3 = entrada.nextInt();

        //Calcular total de la factura
        double subtotal = (precio1 * cantidad1) + (precio2 * cantidad2) + (precio3 * cantidad3);
        double iva = subtotal * 0.21;
        double total = subtotal + iva;

        //Imprimir el total de la factura
        System.out.println("El total de la factura es: $" + total);
    }
}

