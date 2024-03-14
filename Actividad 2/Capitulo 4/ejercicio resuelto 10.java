import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definición de variables
        int NI; // Número de inscripción
        String NOM; // Nombres
        double PAT; // Patrimonio
        int ES; // Estrato social
        double PAGMAT; // Pago por matrícula

        // Entrada de datos
        System.out.print("Número de inscripción: ");
        NI = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Nombres: ");
        NOM = scanner.nextLine();
        System.out.print("Patrimonio: ");
        PAT = scanner.nextDouble();
        System.out.print("Estrato social: ");
        ES = scanner.nextInt();

        // Proceso
        PAGMAT = 50000; // Pago por matrícula inicial

        if (PAT > 2000000 && ES > 3) {
            PAGMAT += 0.03 * PAT; // Incremento del 3% sobre el patrimonio
        }

        // Salida de resultados
        System.out.println("El estudiante con número de inscripción " + NI + " y nombre " + NOM + " debe pagar: $" + PAGMAT);

        scanner.close(); // Cerrar el scanner
    }
}
