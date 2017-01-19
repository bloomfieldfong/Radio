
/**
 * @author Rodrio Juarez 16073 
 * @author Michelle Blooomfield 16803
 *
 */

public interface IRadio {

	public void estado();
	public void frecuencia();
	public void guardar(int pos);
	public float seleccionar(int pos);
	public void Cambiar(boolean cambio);
	public boolean getFrecuencias();
	public boolean getEstado();
	public float getEmisora();
	
}