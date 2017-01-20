
/**
 * @author Rodrio Juarez 16073 
 * @author Michelle Blooomfield 16803
 *
 */



public interface IRadio {

	public void estado();
	public void frecuencia();
	/**
	 * @param pos
	 */
	public void guardar(int pos);
	/**
	 * @param pos
	 * @return nos devuelve la posiciones en la que esta 
	 */
	public float seleccionar(int pos);
	
	/**
	 * 
	 * @param cambio
	 */
	public void Cambiar(boolean cambio);
	public boolean getFrecuencias();
	public boolean getEstado();
	public float getEmisora();
	
}