
/**
 * @author Rodrio Juarez 16073 
 * @author Michelle Blooomfield 16803
 *
 */


public interface Interfaz {

	public void Estado();
	
	public void Frecuencia();
	/**
	 * @param pos
	 */
	public void Guardar(int pos);
	/**
	 * @param pos
	 * @return
	 */
	public float Seleccionar(int pos);
	/**
	 * @param cambio
	 */
	public void Cambiar(boolean cambio);
	
}
