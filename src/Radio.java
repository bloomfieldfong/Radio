
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
		emisoraAM = 530;
		emisoraFM = 87.2f;
		frecuencia = true;
		
	}
//El metodo estado nos indica la radio esta encendida o apagada
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
//El metodo frecuencia nos indica si esta en FM o en AM 
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

//El metodos Guardar nos deja guardar la estacion en la lista
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

//El metodo seleccionar nos devuelve la estacion que esta guardada
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
	
//El metodo nos deja cambiar nos 
	
	@Override
	public void Cambiar(boolean cambio) {
		// TODO Auto-generated method stub
		if (estado == true){
			if (frecuencia == true){
				if (cambio == true){
					emisoraFM= emisoraFM + .2f;
					if (emisoraFM>107.9){
						emisoraFM= 87.2f;
					}
				}
				else{
					emisoraFM= emisoraFM-.2F;
					if (emisoraFM< 87.2){
						emisoraFM=107.9F;
					}
				}
			}
			else{
				if(cambio == true){
					emisoraAM = emisoraAM+10;
					if (emisoraAM> 1610){
						emisoraAM=530;
					}
				}
				else{
					emisoraAM= emisoraAM-10;
					if (emisoraAM< 530){
						emisoraAM= 1610;
					}
				}
				
			}
		}
		
	}
}
