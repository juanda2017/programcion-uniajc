
public class Superficie{
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir la base y la altura del triángulo
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        // Calcular la superficie
        double superficie = (base * altura) / 2;

        // Mostrar el resultado
        System.out.println