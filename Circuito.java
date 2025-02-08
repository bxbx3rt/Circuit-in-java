
/**
 * La clase Circuito es donde se encuentra la función principal.
 *  Se ejecuta el ejercicio propuesto en la práctica.
 * @author Roberto Soria Casanova
 * @author Ignacio Carretero Galindo
 */
 public class Circuito 
 {
     public static void main(String[] args)
     {
         And and = new And();
         Not not = new Not();
         Or or = new Or();
         Or or1 = new Or();
         Xor xor = new Xor();

         FuenteAlimentacion[] entradasAnd = new FuenteAlimentacion[2];
         entradasAnd[0] = new FuenteAlimentacion(true);
         entradasAnd[1] = new FuenteAlimentacion(true);
         and.setEntradas(entradasAnd);

         FuenteAlimentacion[] entradasNot = new FuenteAlimentacion[1];
         entradasNot[0] = new FuenteAlimentacion(false);
         not.setEntradas(entradasNot);

         FuenteAlimentacion[] entradasOr = new FuenteAlimentacion[2];
         entradasOr[0] = new FuenteAlimentacion(and.calculaSalida());
         entradasOr[1] = new FuenteAlimentacion(false);
         or.setEntradas(entradasOr);
         FuenteAlimentacion[] entradasOr1 = new FuenteAlimentacion[2];
         entradasOr1[0] = new FuenteAlimentacion(false);
         entradasOr1[1] = new FuenteAlimentacion(not.calculaSalida());
         or1.setEntradas(entradasOr1);

         FuenteAlimentacion[] entradasXor = new FuenteAlimentacion[2];
         entradasXor[0] = new FuenteAlimentacion(or.calculaSalida());
         entradasXor[1] = new FuenteAlimentacion(or1.calculaSalida());

         xor.setEntradas(entradasXor);

         System.out.println("Salida del circuito: " + xor.calculaSalida());

     }
 }