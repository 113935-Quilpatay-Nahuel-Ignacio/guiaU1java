import java.util.Scanner;
//EJERCICIO 2
public class PrecioConIva2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario que ingrese el precio del artículo
        System.out.print("Ingresa el precio del artículo: ");
        //Detecta cualquier número como decimal
        double precio = scanner.nextDouble();

        //Calcular el precio con IVA (+21%)
        double precioConIva = precio * 1.21;

        //Mostrar precio con IVA en consola
        System.out.println("El precio con IVA es: " + precioConIva);
    }
}
