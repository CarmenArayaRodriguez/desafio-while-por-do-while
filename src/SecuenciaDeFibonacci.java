import java.util.Scanner;

public class SecuenciaDeFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("¿Cuántos números de la secuencia de Fibonacci quieres que se generen y se muestren en pantalla?");
        int numeroUsuario = scanner.nextInt();

        // Se verifica que el número ingresado sea al menos 1
        if (numeroUsuario < 1) {
            System.out.println("Por favor, ingrese un número mayor que 0.");
            // Se finaliza el programa si el número es inválido
            return;
        }

        // Se crea un arreglo para guardar la secuencia de Fibonacci
        int[] secuenciaFibonacci = new int[numeroUsuario];

        // Variables para almacenar los dos últimos números de la secuencia de Fibonacci
        int numeroActual = 0;
        int siguienteNumero = 1;

        // Se genera la secuencia de Fibonacci y se almacena en el arreglo
        for (int i = 0; i < numeroUsuario; i++) {
            secuenciaFibonacci[i] = numeroActual;

            // Se calcula el próximo número de la secuencia
            int sumaNumerosAnteriores = numeroActual + siguienteNumero;
            numeroActual = siguienteNumero;
            siguienteNumero = sumaNumerosAnteriores;
        }


        scanner.close();

        // Se muestra la secuencia de Fibonacci
        System.out.println("Secuencia de Fibonacci:");
        for (int i = 0; i < secuenciaFibonacci.length; i++) {
            System.out.println(secuenciaFibonacci[i]);
        }
    }
}
