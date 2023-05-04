import java.util.Scanner;
//EJERCICIO 6
public class Bisiesto
{
    public static void main(String[] args)
    {
        //Declarar scanner, año y condición de bisiesto
        Scanner entrada = new Scanner(System.in);
        int anio;
        boolean esBisiesto = false;

        //Ingresar el año
        System.out.println("Ingrese un año: ");
        anio = entrada.nextInt();

        //Verificar si es bisiesto
        //Si el año dividido 4 es 0 y el año dividido 100 es distinto a 0
        //O si el año dividido 400 es 0
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0)
        {
            esBisiesto = true;
        }

        //Imprimir resultado
        if (esBisiesto)
        {
            System.out.println(anio + " es un año bisiesto");
        }
        else
        {
            System.out.println(anio + " no es un año bisiesto");
        }
    }
}
