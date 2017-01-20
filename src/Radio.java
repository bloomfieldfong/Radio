
/**
 * @author Rodrio Juarez 16073 
 * @author Michelle Blooomfield 16803
 *
 */
public class Radio implements IRadio {

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
		emisoraFM = 87.9f;
		frecuencia = true;
		
	}
//Metodo estado sirve para definir el estado en el que estara la radio
	@Override
	public void estado() {
		// TODO Auto-generated method stub
		if (estado==true){
			estado=false;
		}
		else{
			estado=true;
		}
		
	}
//Nos indicara la frecuencia en la que esta 
	@Override
	public void frecuencia() {
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
//Guardara las estaciones en las que se este posicionado
	@Override
	public void guardar(int pos) {
		// TODO Auto-generated method stub
		if (estado == true){
			if (frecuencia == true){
				estacionesFM[pos]=emisoraFM;
				System.out.println(emisoraFM);
				System.out.println(estacionesFM[pos]);
			}
			else{
				estacionesAM[pos]=emisoraAM;
			}
			
		}
		
	}

//Cambiara en estado de AM a FM
	@Override
	public void Cambiar(boolean cambio) {
		// TODO Auto-generated method stub
		if (estado == true){
			if (frecuencia == true){
				if (cambio == true){
					emisoraFM= emisoraFM + .2f;
					if (emisoraFM>107.9){
						emisoraFM= 87.9f;
					}
				}
				else{
					emisoraFM= emisoraFM-.2F;
					if (emisoraFM< 87.9){
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
	
	@Override
	public float seleccionar(int pos) {
		// TODO Auto-generated method stub
		if (estado==true){
			if (frecuencia==true){
				if (estacionesFM[pos]!=0){
					emisoraFM=estacionesFM[pos];
				}
			}
			else{
				if (estacionesAM[pos]!=0){
					emisoraAM=estacionesAM[pos];	
				}
			}
		}
		return getEmisora();
	}
	//Nos devulve la frecuecia en la que esta la radio
	@Override
	public boolean getFrecuencias() {
		// TODO Auto-generated method stub
		return frecuencia;
	}
	//Nos devuelve el estado que se escuenta la radio
	@Override
	public boolean getEstado() {
		// TODO Auto-generated method stub
		return estado;
	}

	//Nos devuelve el estado de la emisora en la que estamos
	@Override
	public float getEmisora() {
		// TODO Auto-generated method stub
		float emisora=0;
		if (frecuencia==true){
			emisora= emisoraFM;
		}
		else{
			emisora=emisoraAM;
		}
		return emisora;
	}
}
