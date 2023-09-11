// Definir una nueva clase llamada "SumCalculator"
package Singleton;
public class SumCalculador {
    // Declarar una variable estática llamada "instance" de tipo "SumCalculator"
    private static SumCalculador instance;

    // Declarar una variable de instancia llamada "sum" para almacenar la suma
    private int sum;

    // Constructor privado que inicializa la suma en cero
    private SumCalculador() {
        sum = 0;
    }

    // Método estático que devuelve una instancia de "SumCalculator" (patrón Singleton)
    public static SumCalculador getInstance() {
        // Verificar si ya existe una instancia
        if (instance == null) {
            // Si no existe, crear una nueva instancia
            instance = new SumCalculador();
        }
        // Devolver la instancia (nueva o existente)
        return instance;
    }

    // Método para agregar un número a la suma
    public void addToSum(int number) {
        sum += number;
    }

    // Método para obtener la suma actual
    public int getCurrentSum() {
        return sum;
    }
}
