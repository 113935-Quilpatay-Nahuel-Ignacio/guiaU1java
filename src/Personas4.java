import java.util.Scanner;
//EJERCICIO 4
public class Personas4
{
    public static void main(String[] args)
    {
        //Declaración de scanner, nombres y alturas
        Scanner entrada = new Scanner(System.in);
        String nombre1, nombre2;
        double altura1, altura2;

        //Ingresar datos de la primera persona
        System.out.println("Ingrese el nombre de la primera persona: ");
        nombre1 = entrada.nextLine();
        System.out.println("Ingrese la altura de la primera persona (en metros): ");
        altura1 = entrada.nextDouble();
        entrada.nextLine();

        //2da persona
        System.out.println("Ingrese el nombre de la segunda persona: ");
        nombre2 = entrada.nextLine();
        System.out.println("Ingrese la altura de la segunda persona (en metros): ");
        altura2 = entrada.nextDouble();

        //Determinar quién es más alto
        if (altura1 > altura2)
        {
            //Mostrar nombre y altura en paréntesis
            System.out.println("La persona más alta es: " + nombre1 +" ("+altura1+" mts.)");
        }
        else
        {
            System.out.println("La persona más alta es: " + nombre2 +" ("+altura2+" mts.)");
        }
    }
}
