import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las ventas del departamento 1:");
        double ventasDept1 = scanner.nextDouble();

        System.out.println("Ingrese las ventas del departamento 2:");
        double ventasDept2 = scanner.nextDouble();

        System.out.println("Ingrese las ventas del departamento 3:");
        double ventasDept3 = scanner.nextDouble();

        System.out.println("Ingrese el salario de los vendedores:");
        double salario = scanner.nextDouble();

        double totalVentas = ventasDept1 + ventasDept2 + ventasDept3;
        double porcentajeVentas = totalVentas * 0.33;

        double salarioDept1 = (ventasDept1 > porcentajeVentas) ? salario + 0.2 * salario : salario;
        double salarioDept2 = (ventasDept2 > porcentajeVentas) ? salario + 0.2 * salario : salario;
        double salarioDept3 = (ventasDept3 > porcentajeVentas) ? salario + 0.2 * salario : salario;

        System.out.println("Salario vendedores departamento 1: $" + salarioDept1);
        System.out.println("Salario vendedores departamento 2: $" + salarioDept2);
        System.out.println("Salario vendedores departamento 3: $" + salarioDept3);

        scanner.close();
    }
}
