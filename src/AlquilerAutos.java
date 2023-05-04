import java.util.Scanner;
//EJERCICIO 7
public class AlquilerAutos
{
    public static void main(String[] args)
    {
        //Declarar scanner, kilometros e importe (iniciado en 0)
        Scanner entrada = new Scanner(System.in);
        int kmRecorridos;
        double importeTotal = 0;

        //Ingresar cantidad de km recorridos
        System.out.println("Ingrese la cantidad de km recorridos: ");
        kmRecorridos = entrada.nextInt();

        //Calcular el importe total a cobrar
        //Si los km recorridos son menores o iguales a 200
        if (kmRecorridos <= 200)
        {
            importeTotal = 300;
        }
        //Si los km se encuentran entre 200 y 1000
        else if (kmRecorridos <= 1000)
        {
            //Cobrar $5 adicionales por kilómetro
            importeTotal = 300 + (kmRecorridos - 200) * 5;
        }
        else
        //Si los km son más de 1000
        {
            //Cobrar $10 adicionales por kilómetro
            importeTotal = 300 + 800 * 5 + (kmRecorridos - 1000) * 10;
        }

        //Imprimir el importe total a cobrar
        System.out.println("El importe total a cobrar es: $" + importeTotal);
    }
}

