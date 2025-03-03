public class Constantes {
  public static void main(String[] args) {
      // Constantes válidas
      int a = 234;       // Entero válido
      double b = -8.975; // Número decimal válido
      double d = 0;      // Entero válido, también puede ser double

      // Constante en notación científica (válida en Java si está bien escrita)
      double c = 12E-5;  // Correcta (equivalente a 12 * 10^-5)

      // Imprimir valores para verificar
      System.out.println("a = " + a);
      System.out.println("b = " + b);
      System.out.println("c = " + c);
      System.out.println("d = " + d);

      // Constante incorrecta: 12E – 5 (con guion largo y espacio)
      // Esto generaría un error de sintaxis en Java, así que no se puede escribir directamente.
  }
}
