import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        double salarioPorHora;
        int horasTrabajadas;
        double salarioMensual;

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese el salario básico por hora: ");
        salarioPorHora = scanner.nextDouble();
        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        horasTrabajadas = scanner.nextInt();

        salarioMensual = salarioPorHora * horasTrabajadas;

        if (salarioMensual > 450000) {
            System.out.println("Nombre del empleado: " + nombre);
            System.out.println("Salario mensual: $" + salarioMensual);
        } else {
            System.out.println("Nombre del empleado: " + nombre);
        }

        scanner.close();
    }
}
