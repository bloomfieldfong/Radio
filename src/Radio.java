
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
				System.out.println(emisoraFM);
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
			if (frecuencia == true){
				if ((pos!=0) && (estacionesFM[pos]!=0))
				emisoraFM=estacionesFM[pos];
				est=emisoraFM;
			}
			else{
				if (pos!=0 && (estacionesAM[pos]!=0))
					emisoraAM=estacionesAM[pos];
				est= emisoraAM;
			}
		}
		return est;
	}

	@Override
	public void Cambiar(boolean cambio) {
		// TODO Auto-generated method stub
		if (estado == true){
			if (frecuencia == true){
				if (cambio == true){
					emisoraFM= emisoraFM + .2f;
					if (emisoraFM>107.9){
						emisoraFM= 88.2f;
					}
				}
				else{
					emisoraFM= emisoraFM-.2F;
					if (emisoraFM< 88.2){
						emisoraFM=107.9F;
					}
				}
			}
			else{
				if(cambio == true){
					emisoraAM = emisoraAM+10;
					if (emisoraAM> 5000){
						emisoraAM=510;
					}
				}
				else{
					emisoraAM= emisoraAM-10;
					if (emisoraAM< 510){
						emisoraAM= 5000;
					}
				}
				
			}
		}
		
	}
}
