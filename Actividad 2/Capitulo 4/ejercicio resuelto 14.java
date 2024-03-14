import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double VALCOMP;
        String COLOR;
        double VALPAG;
        double PDES;

        System.out.print("Valor de la compra: ");
        VALCOMP = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Color de la bolita (BLANCO, VERDE, AMARILLO, AZUL): ");
        COLOR = scanner.nextLine().toUpperCase();

        if (COLOR.equals("BLANCO")) {
            PDES = 0;
        } else if (COLOR.equals("VERDE")) {
            PDES = 10;
        } else if (COLOR.equals("AMARILLO")) {
            PDES = 25;
        } else if (COLOR.equals("AZUL")) {
            PDES = 50;
        } else {
            PDES = 100;
        }

        VALPAG = VALCOMP - PDES * VALCOMP / 100;

        System.out.println("El cliente debe pagar: $" + VALPAG);

        scanner.close();
    }
}
