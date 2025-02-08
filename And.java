/**
 * Clase que representa una puerta lógica AND.
 * Calcula la salida según las dos entradas empleando la operación logica AND.
 * @author Roberto Soria Casanova
 * @author Ignacio Carretero Galindo
 */
public class And extends PuertaLogica
    {
        /*
         * Tabla de verdad Puerta AND:
         * A | B | Salida
         * 0 | 0 | 0
         * 0 | 1 | 0
         * 1 | 0 | 0
         * 1 | 1 | 1
         */
        

         /**
          * Calcula la salida de la puerta AND en función de sus dos entradas.
          * @return true si ambas son true, y false en caso contrario.
          */
         @Override
         public boolean calculaSalida()
         {
            return entradas[0].calculaSalida() && entradas[1].calculaSalida();
         }

    }
    