/**
     * Clase que representa una fuente de alimentación, es decir una entrada fija a una puerta lógica del circuito.
     * Extiende ElementoCircuito.
     * @author Roberto Soria Casanova
     * @author Ignacio Carretero Galindo
     */
    public class FuenteAlimentacion extends ElementoCircuito
    {
        private boolean salida; // Representa el estado de la fuente (true/false).

        /** CONSTRUCTOR
         * Crea una fuente de alimentación con el estado introducido (true, false).
         * @param estado es el valor de la fuente true(1) ó false (0).
         */
        public FuenteAlimentacion(boolean estado)
        {
            salida = estado;
        }
        /**
         * Calcula y devuelve el valor de la salida actual de la fuente de alimentación.
         * @return booleano que representa el estado de la fuente (true/false).
         */
        @Override
        public boolean calculaSalida()
        {
            return salida;
        }

    }

