   /**
     * Clase que representa una puerta lógica OR.
     * Calcula la salida basándose en la puerta lógica OR de dos entradas.
     * @author Roberto Soria Casanova
     * @author Ignacio Carretero Galindo
     */
    public class Or extends PuertaLogica
    {
        /*
         * Tabla de verdad Puerta OR:
         * A | B | Salida
         * 0 | 0 | 0
         * 0 | 1 | 1
         * 1 | 0 | 1
         * 1 | 1 | 1
         */
        /**
         * Calcula la salida de la puerta OR en función de sus dos entradas.
         * @return true si al menos una de las entradas es true ó false si ambas son false.
         */
         @Override
         public boolean calculaSalida()
         {
            return entradas[0].calculaSalida() || entradas[1].calculaSalida();
         }
         

    }