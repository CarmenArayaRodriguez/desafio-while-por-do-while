import java.util.Scanner;

public class SoloPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        // Se lee un entero desde la entrada del usuario
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            // Se imprimen los pares desde 0
            System.out.println(2 * i);
        }

        // Se cierra el objeto scanner
        scanner.close();
    }
}
