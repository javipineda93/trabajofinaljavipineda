/**
 * Excepcion que nos saltará si el nombre del jugador está vacío.
 */

package excepciones;

public class NombreVacioException extends Exception{
		public NombreVacioException (String m) {
			super(m);
		}
}
