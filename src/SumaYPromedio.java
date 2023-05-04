import java.util.Scanner;
//EJERCICIO 8
public class SumaYPromedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadNumeros = 10;
        int suma = 0;
        double promedio = 0;

        // Ingresar 10 números por teclado y acumular su suma
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese el número " + (i+1) + ":");
            int numero = entrada.nextInt();
            suma += numero;
        }

        // Calcular el promedio
        promedio = (double) suma / cantidadNumeros;

        // Imprimir la suma y el promedio
        System.out.println("La suma de los 10 números es: " + suma);
        System.out.println("El promedio de los 10 números es: " + promedio);
    }
}

