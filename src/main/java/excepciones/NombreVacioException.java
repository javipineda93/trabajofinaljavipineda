/**
 * Excepcion que nos saltar� si el nombre del jugador est� vac�o.
 */

package excepciones;

public class NombreVacioException extends Exception{
		public NombreVacioException (String m) {
			super(m);
		}
}
