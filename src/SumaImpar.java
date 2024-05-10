import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i += 2) {
            // Se suman solo los números impares
            suma += i;
        }
        // Se imprime la suma de los números impares
        System.out.println(suma);

        scanner.close();
    }
}
