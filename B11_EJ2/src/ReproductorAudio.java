
public class ReproductorAudio extends ReproductorPortatil implements IReproductorAudio {

	//Atributos 
	private boolean bReproduceAudioCds, bReproduceMP3, bReproduceWMA, bReproduceVorbis, bAccesoPorCarpetas, bRadio, bGrabacionDeVoz;

	//Constructor
	public ReproductorAudio(String sMarca, String sModelo, byte bTipoDeAlmacenamiento, boolean bReproduceCDs, boolean bReproduceMP3, boolean bReproduceWMA, boolean bReproduceVorbis) {
		super(sMarca, sModelo, bTipoDeAlmacenamiento);
		this.setbReproduceAudioCds(bReproduceCDs);
		this.setbReproduceMP3(bReproduceMP3);
		this.setbReproduceWMA(bReproduceWMA);
		this.setbReproduceVorbis(bReproduceVorbis);	
	}
		
	//Get and set
	@Override
	public boolean isbReproduceAudioCds() {
		return bReproduceAudioCds;
	}
	@Override
	public void setbReproduceAudioCds(boolean bReproduceAudioCds) {
		if(getbTipoDeAlmacenamiento() != IReproductorAudio.CD){
			this.setbReproduceAudioCds(false);
		}else {
		this.bReproduceAudioCds = bReproduceAudioCds;
	}
	}
	@Override
	public boolean isbReproduceMP3() {
		return bReproduceMP3;
	}
	@Override
	public void setbReproduceMP3(boolean bReproduceMP3) {
		this.bReproduceMP3 = bReproduceMP3;
	}
	@Override
	public boolean isbReproduceWMA() {
		return bReproduceWMA;
	}
	@Override
	public void setbReproduceWMA(boolean bReproduceWMA) {
		this.bReproduceWMA = bReproduceWMA;
	}
	@Override
	public boolean isbReproduceVorbis() {
		return bReproduceVorbis;
	}
	@Override
	public void setbReproduceVorbis(boolean bReproduceVorbis) {
		this.bReproduceVorbis = bReproduceVorbis;
	}
	@Override
	public boolean isbAccesoPorCarpetas() {
		return bAccesoPorCarpetas;
	}
	@Override
	public void setbAccesoPorCarpetas(boolean bAccesoPorCarpetas) {
		this.bAccesoPorCarpetas = bAccesoPorCarpetas;
	}
	@Override
	public boolean isbRadio() {
		return bRadio;
	}
	@Override
	public void setbRadio(boolean bRadio) {
		this.bRadio = bRadio;
	}
	@Override
	public boolean isbGrabacionDeVoz() {
		return bGrabacionDeVoz;
	}
	@Override
	public void setbGrabacionDeVoz(boolean bGrabacionDeVoz) {
		this.bGrabacionDeVoz = bGrabacionDeVoz;
	}
}