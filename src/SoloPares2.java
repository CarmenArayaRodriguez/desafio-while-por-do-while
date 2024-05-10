import java.util.Scanner;

public class SoloPares2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        // Se lee el entero desde la entrada del usuario
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Se imprimen los pares empezando desde 2
            System.out.println(2 * i);
        }

        scanner.close();
    }
}
