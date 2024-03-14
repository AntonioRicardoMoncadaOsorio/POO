import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código del empleado:");
        int codigoEmpleado = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Ingrese los nombres del empleado:");
        String nombres = scanner.nextLine();

        System.out.println("Ingrese el número de horas trabajadas al mes:");
        int horasTrabajadas = scanner.nextInt();

        System.out.println("Ingrese el valor por hora trabajada:");
        double valorHora = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de retención en la fuente:");
        double porcentajeRetencion = scanner.nextDouble();
        double salarioBruto = horasTrabajadas * valorHora;
        double retencionFuente = salarioBruto * (porcentajeRetencion / 100);
        double salarioNeto = salarioBruto - retencionFuente;

        System.out.println("\nInformación del empleado:");
        System.out.println("Código del empleado: " + codigoEmpleado);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Salario Neto: $" + salarioNeto);

        scanner.close();
    }
}
