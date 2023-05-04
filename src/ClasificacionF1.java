import java.util.Scanner;
//EJERCICIO 11
public class ClasificacionF1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ingresar tiempo del ganador
        System.out.print("Ingrese el tiempo en segundos del ganador: ");
        double tiempoGanador = entrada.nextDouble();

        // Ingresar tiempos de los otros corredores y contar cuántos disputarán la carrera
        int contador = 0;
        for (int i = 1; i <= 9; i++) {
            System.out.print("Ingrese el tiempo en segundos del corredor " + i + ": ");
            double tiempoCorredor = entrada.nextDouble();
            if (tiempoCorredor <= tiempoGanador * 1.15) {
                contador++;
            }
        }

        // Imprimir cantidad de corredores que disputarán la carrera
        System.out.println("Cantidad de corredores que disputarán la carrera: " + contador);
    }
}
