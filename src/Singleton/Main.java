import Singleton.SumCalculador;
import java.util.Scanner;
public class Main {
       public static void main(String[] args) {
        // Obtener una instancia de SumCalculator utilizando el método estático "getInstance"
        SumCalculador calculator = SumCalculador.getInstance();

        // Crear un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);

        // Mostrar un mensaje al usuario
        System.out.println("Ingrese números para Sumar (ingrese un número negativo para detener):");

        // Iniciar un bucle infinito
        while (true) {
            // Leer un número entero desde la entrada del usuario
            int number = scanner.nextInt();

            // Verificar si el número ingresado es negativo
            if (number < 0) {
                // Si es negativo, salir del bucle
                break;
            }

            // Agregar el número a la suma utilizando el método "addToSum" de la instancia de SumCalculator
            calculator.addToSum(number);
        }

        // Obtener la suma actual utilizando el método "getCurrentSum" y mostrarla en la consola
        int currentSum = calculator.getCurrentSum();
        System.out.println("La suma es: " + currentSum);
    }
}