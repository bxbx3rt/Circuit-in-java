/**
 * Clase que representa una puerta lógica NOT.
 * Calcula la salida invirtiendo el valor de la única entrada.
 * @author Roberto Soria Casanova
 * @author Ignacio Carretero Galindo
 */
public class Not extends PuertaLogica
    {
        /*
         * Tabla de verdad Puerta NOT:
         * A | Salida
         * 0 | 1
         * 1 | 0
         */


        /**
         * Calcula la salida de la puerta NOT en función de su entrada.
         * @return true si la entrada es false ó false si su entrada es true.
         */
         @Override
         public boolean calculaSalida()
         {
            return !entradas[0].calculaSalida();
         }
        

    }