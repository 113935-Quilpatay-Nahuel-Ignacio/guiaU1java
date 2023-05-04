import java.util.Scanner;
//EJERCICIO 10
public class ValidarNumeroPositivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Ingrese un número positivo:");
            numero = entrada.nextInt();
        } while (numero < 0);

        System.out.println("El número ingresado es: " + numero);
    }
}
