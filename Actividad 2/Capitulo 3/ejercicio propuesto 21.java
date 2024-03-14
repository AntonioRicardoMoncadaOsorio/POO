import java.util.Scanner;

    public class ejercicio21 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la coordenada X del primer punto: ");
            double X1 = scanner.nextDouble();
            System.out.print("Ingrese la coordenada Y del primer punto: ");
            double Y1 = scanner.nextDouble();
            System.out.print("Ingrese la coordenada X del segundo punto: ");
            double X2 = scanner.nextDouble();
            System.out.print("Ingrese la coordenada Y del segundo punto: ");
            double Y2 = scanner.nextDouble();

            double[] parametros = calcularRecta(X1, Y1, X2, Y2);
            double A = parametros[0];
            double B = parametros[1];
            double C = parametros[2];

            System.out.println("Los parámetros de la recta son:");
            System.out.println("A = " + A);
            System.out.println("B = " + B);
            System.out.println("C = " + C);
        }

        public static double[] calcularRecta(double X1, double Y1, double X2, double Y2) {
            // Calcular la pendiente (m)
            double m = (Y2 - Y1) / (X2 - X1);

            // Calcular el término C
            double C = -m * X1 + Y1;

            // Parámetros A, B y C de la ecuación de la recta
            double[] parametros = new double[3];
            parametros[0] = m;
            parametros[1] = -1;
            parametros[2] = C;

            return parametros;
        }
    }

