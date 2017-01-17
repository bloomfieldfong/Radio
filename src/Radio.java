
/**
 * @author Rodrio Juarez 16073 
 * @author Michelle Blooomfield 16803
 *
 */
public class Radio implements Interfaz {

	private boolean estado;
	private float estacionesAM[];
	private float estacionesFM[];
	private float emisoraAM;
	private float emisoraFM;
	private boolean frecuencia;
	
	public Radio(){
		estado = true;
		estacionesAM = new float[13];
		estacionesFM= new float [13];
		emisoraAM = 510;
		emisoraFM = 88.2f;
		frecuencia = true;
		
	}

	@Override
	public void Estado() {
		// TODO Auto-generated method stub
		if (estado==true){
			estado=false;
		}
		else{
			estado=true;
		}
		
	}

	@Override
	public void Frecuencia() {
		// TODO Auto-generated method stub
		if (estado == true){
			if (frecuencia == true ){
				frecuencia = false;
			}
			else {
				frecuencia = true;
			}
		}
		
	}

	@Override
	public void Guardar(int pos) {
		// TODO Auto-generated method stub
		if (estado == true){
			if (frecuencia == true){
				estacionesFM[pos]=emisoraFM;
			}
			else{
				estacionesAM[pos]=emisoraAM;
			}
			
		}
		
	}

	@Override
	public float Seleccionar(int pos) {
		// TODO Auto-generated method stub
		float est=0;
		if (estado == true){
			if (frecuencia==true){
				est= estacionesFM[pos];
			}
			else{
				est= estacionesAM[pos];
			}
		}
		return est;
	}

	@Override
	public void Cambiar(boolean cambio) {
		// TODO Auto-generated method stub
		if (estado == true){
			
		}
		
	}
}
