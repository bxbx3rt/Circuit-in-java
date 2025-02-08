/**
  * Clase abstracta que representa un elemento de un circuito lógico.
  * Las clases que participen en la jerarquía de ElementoCircuito deberán implementar la funcion calculaSalida.
  * @author Roberto Soria Casanova
  * @author Ignacio Carretero Galindo
  */
  abstract public class ElementoCircuito
  {
    /**
     * Funcion establecida como abstract, generando un 'requisito' para que las subclases de ElementoCircuito
     * deban implementarla.
     */
      abstract public boolean calculaSalida();

  }