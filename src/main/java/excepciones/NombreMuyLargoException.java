/**
 * excepcion que nos mostrará si el nombre seleccionado para el jugador es demasiado largo (Maximo 15 caracteres).
 */

package excepciones;

public class NombreMuyLargoException extends Exception{
		public NombreMuyLargoException (String m) {
			super(m);
		}
}
