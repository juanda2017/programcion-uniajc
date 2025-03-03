public class Ejercicio {
    public static void main(String[] args) {
        // Definimos los valores de A y B
        int A = 2;
        int B = 5;

        // Evaluamos la expresión: 3*A - 4*B / A^2
        double resultado = (3 * A - 4 * B / Math.pow(A, 2));

        // Mostramos el resultado
        System.out.println("El resultado es: " + resultado);
    }
}