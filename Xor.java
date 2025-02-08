  /**
     * Clase que representa una puerta lógica XOR.
     * Calcula la salida basándose en la operación lógica XOR de dos entradas.
     *@author Roberto Soria Casanova
     * @author Ignacio Carretero Galindo
     */
    public class Xor extends PuertaLogica
    {
        /*
         * Tabla de verdad Puerta XOR:
         * A | B | Salida
         * 0 | 0 | 0
         * 0 | 1 | 1
         * 1 | 0 | 1
         * 1 | 1 | 0
         */

        /**
         * Calcula la salida de la puerta XOR en fución de sus entradas.
         * @return true si una entrada es true y la otra es false ó false si ambas son iguales. 
         */
         @Override
         public boolean calculaSalida()
         {
            return (entradas[0].calculaSalida() && !entradas[1].calculaSalida()) || (!entradas[0].calculaSalida() && entradas[1].calculaSalida());
         }
        

    }