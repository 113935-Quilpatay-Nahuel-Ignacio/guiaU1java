import java.util.Scanner;
//EJERCICIO 9
public class MayoresQueCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadNumeros, mayoresQueCinco = 0;

        // Ingresar la cantidad de números
        System.out.println("Ingrese la cantidad de números a ingresar:");
        cantidadNumeros = entrada.nextInt();

        // Ingresar los números y contar los mayores que 5
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese el número " + (i+1) + ":");
            int numero = entrada.nextInt();
            if (numero > 5) {
                mayoresQueCinco++;
            }
        }

        // Imprimir la cantidad de números mayores que 5
        System.out.println("La cantidad de números mayores que 5 es: " + mayoresQueCinco);
    }
}
