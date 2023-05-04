import java.util.Scanner;
//EJERCICIO 12
public class ConcesionariaUsados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int antiguedad;
        int cantAutos = 0;
        int cantPocoUso = 0;
        int sumAntiguedad = 0;
        int cantNoMuyAntiguos = 0;

        do {
            System.out.print("Ingrese la antigüedad del auto (0 para salir): ");
            antiguedad = sc.nextInt();

            if (antiguedad > 0) {
                cantAutos++;

                if (antiguedad >= 1 && antiguedad <= 5) {
                    System.out.println("NUEVO");
                } else if (antiguedad >= 6 && antiguedad <= 10) {
                    System.out.println("POCO USO");
                    cantPocoUso++;
                } else if (antiguedad >= 11 && antiguedad <= 20) {
                    System.out.println("MUCHO USO");
                } else {
                    System.out.println("MUY ANTIGUO");
                }

                if (antiguedad < 20) {
                    sumAntiguedad += antiguedad;
                    cantNoMuyAntiguos++;
                }
            }
        } while (antiguedad != 0);

        System.out.println("Cantidad total de autos: " + cantAutos);
        System.out.println("Cantidad de autos con poco uso: " + cantPocoUso);

        if (cantNoMuyAntiguos > 0) {
            double promedioAntiguedad = (double) sumAntiguedad / cantNoMuyAntiguos;
            System.out.printf("Promedio de antigüedad de los autos que no son muy antiguos: %.2f\n", promedioAntiguedad);
        } else {
            System.out.println("No hay autos que no sean muy antiguos.");
        }
    }
}

