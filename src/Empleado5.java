import java.util.Scanner;
//EJERCICIO 5
public class Empleado5
{
    public static void main(String[] args)
    {
        //Declarar scanner y variables a almacenar/calcular
        Scanner entrada = new Scanner(System.in);
        int horasTrabajadas;
        double sueldoPorHora, sueldoTotal;

        //Ingresar cantidad de horas trabajadas y sueldo por hora
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();
        System.out.println("Ingrese el sueldo por hora: ");
        sueldoPorHora = entrada.nextDouble();

        //Calcular el sueldo total sin horas extras
        sueldoTotal = horasTrabajadas * sueldoPorHora;

        //Calcular el sueldo total con horas extras (si las horas trabajadas son +180)
        if (horasTrabajadas > 180)
        {
            //Calcular cant. de horas extras, multiplicarlas por el sueldo normal + 50%
            int horasExtras = horasTrabajadas - 180;
            double sueldoHorasExtras = horasExtras * sueldoPorHora * 1.5;
            //x += y / x = x + y
            sueldoTotal += sueldoHorasExtras;
        }

        //Imprimir el sueldo total a cobrar
        System.out.println("El sueldo total a cobrar es: $" + sueldoTotal);
    }
}
