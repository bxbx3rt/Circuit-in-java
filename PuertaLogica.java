/**
 * Clase abstracta que representa una puerta lógica en un circuito.
 * Extiende ElementoCircuito.
 * @author Roberto Soria Casanova
 * @author Ignacio Carretero Galindo
 */
public abstract class PuertaLogica extends ElementoCircuito
    {
        protected ElementoCircuito[] entradas; // Conjunto de entradas conectadas a una misma o diferentes puertas lógicas.

/**
 * Asigna las entradas de la puerta lógica.
 * @param in los elementos del circuito que representan las entradas a la puerta en cuestión.
 */
        public void setEntradas(ElementoCircuito[] in)
        {
            entradas = in;
        }
    }