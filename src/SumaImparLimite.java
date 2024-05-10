import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el valor mínimo (min): ");
        // Se lee el valor mínimo desde la entrada del usuario
        int min = scanner.nextInt();


        System.out.print("Ingrese el valor máximo (max): ");
        // Se lee el valor máximo desde la entrada del usuario
        int max = scanner.nextInt();

        int suma = 0;
        // Se asegura de que min sea impar
        if (min % 2 == 0) min++;
        for (int i = min; i <= max; i += 2) {
            // Se suman solo los números impares en el rango.
            suma += i;
        }
        System.out.printf("La suma de impares en el rango es: %d", suma);

        scanner.close();
    }
}
