
     public class ProduccionBarras    {  
   
      public static void main(String[] args) {
        
      }
    final double
    Costo_materia_prima =2.50;
     final double Costo_empaque =0.50;
     final int Barras_por_caja =10;
     final double Ganacia =1.30;
       //variables 
       int cantidadBarras;
       double costoPorBarras,
       costosproduciontotal,
       precioventaporBarra,ingresoTotal,ganaciaTotal;
       int cajascompletas,
       barrasSueltas;
          //Entrada de datos 
                    Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de barras producidas en el día: ");
        cantidadBarras = scanner.nextInt();

        // Cálculo de los costos producidos
        costoPorBarras = Costo_materia_prima + Costo_empaque;
        costosProduccionTotal = cantidadBarras * costoPorBarras;
        

        // Cálculo del precio de venta por barra
        ProduccionBarrasrecioVentaPorBarra = costoPorBarras * Ganancia;

        // Cálculo del ingreso total y ganancia total
        ingresoTotal = cantidadBarras * precioVentaPorBarra;
        gananciaTotal = ingresoTotal - costosProduccionTotal;


            // Cálculo de cajas completas y barras sueltas
            cajasCompletas = cantidadBarras / Barras_por_caja;
            barrasSueltas = cantidadBarras % Barras_por_caja


                // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Costo total de producción: $" + costosProduccionTotal);
        System.out.println("Precio de venta por barra: $" + precioVentaPorBarra);
        System.out.println("Ingreso total del día: $" + ingresoTotal);
        System.out.println("Ganancia total del día: $" + gananciaTotal);
        System.out.println("Cajas completas empacadas: " + cajasCompletas);
        System.out.println("Barras sueltas para el siguiente día: " + barrasSueltas);

        // Cerrar el scanner
        scanner.close();
    }
}

  public static void main(String[]args) {
    // Costantes de costos y 