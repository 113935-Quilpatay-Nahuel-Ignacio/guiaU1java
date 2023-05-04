import java.util.Scanner;
//EJERCICIO 1
public class Calculadora1
{
    public static void main(String[] args)
    {
        //El scanner lee datos ingresados(.in) del teclado
        Scanner scanner = new Scanner(System.in);

        //Ingresar números, el scanner los detecta como int
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        //Calcular la suma, diferencia, producto y cociente
        int suma = num1 + num2;
        int diferencia = num1 - num2;
        int producto = num1 * num2;
        //(double) permite obtener el resultado en decimales
        double cociente = (double) num1 / num2;

        //Mostrar los resultados de salida (.out) mediante una impresión en consola (.println)
        System.out.println("La suma es: " + suma);
        System.out.println("La diferencia es: " + diferencia);
        System.out.println("El producto es: " + producto);
        System.out.println("El cociente es: " + cociente);
    }
}
