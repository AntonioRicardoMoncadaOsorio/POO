import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pesoA, pesoB, pesoC;

        System.out.println("Ingrese el peso de la esfera A:");
        pesoA = scanner.nextDouble();
        System.out.println("Ingrese el peso de la esfera B:");
        pesoB = scanner.nextDouble();
        System.out.println("Ingrese el peso de la esfera C:");
        pesoC = scanner.nextDouble();

        String esferaMayorPeso;
        if (pesoA > pesoB && pesoA > pesoC) {
            esferaMayorPeso = "A";
        } else if (pesoB > pesoA && pesoB > pesoC) {
            esferaMayorPeso = "B";
        } else {
            esferaMayorPeso = "C";
        }

        System.out.println("La esfera de mayor peso es la esfera " + esferaMayorPeso);

        scanner.close(); // Cerrar el scanner
    }
}

