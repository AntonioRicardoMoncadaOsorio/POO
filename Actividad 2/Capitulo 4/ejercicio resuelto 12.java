import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String NOM;
        int NHT;
        double VHN;
        int HET;
        int HEE8;
        double SALARIO;


        System.out.print("Nombre del trabajador: ");
        NOM = scanner.nextLine();
        System.out.print("Número de horas trabajadas: ");
        NHT = scanner.nextInt();
        System.out.print("Valor hora normal trabajada: ");
        VHN = scanner.nextDouble();

        if (NHT > 40) {
            HET = NHT - 40;
            if (HET > 8) {
                HEE8 = HET - 8;
                SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
            } else {
                SALARIO = 40 * VHN + HET * 2 * VHN;
            }
        } else {
            SALARIO = NHT * VHN;
        }

        System.out.println("El trabajador " + NOM + " devengó: $" + SALARIO);

        scanner.close();
    }
}

