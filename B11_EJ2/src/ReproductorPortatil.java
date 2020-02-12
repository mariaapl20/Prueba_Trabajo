
public abstract class ReproductorPortatil {
	//Atributos
	private String sMarca, sModelo;
	private boolean bReproduceSonido, bReproduceVideo;
	private byte bTipoDeAlmacenamiento, bPantalla, bTipoDeBateria;
	private int iCapacidadDeAlmacenamiento, iAutonomia;
	private float fPeso, fAlto, fAncho, fGrosor;
	
	//Constructor
	public ReproductorPortatil(String sMarca, String sModelo, byte bTipoDeAlmacenamiento) {
		this.setsMarca(sMarca);
		this.setsModelo(sModelo);
		this.setbReproduceSonido(false);
		this.setbReproduceVideo(false);
		this.setbTipoDeAlmacenamiento(bTipoDeAlmacenamiento);
		this.setbPantalla((byte) 0);
		this.setbTipoDeBateria((byte) 0);
		this.setiCapacidadDeAlmacenamiento(0);
		this.setiAutonomia(0);
		this.setfPeso(0);
		this.setfAlto(0);
		this.setfAncho(0);
		this.setfGrosor(0);
	}
	
	//Get and set
	public String getsMarca() {
		return sMarca;
	}
	public byte getbTipoDeBateria() {
		return bTipoDeBateria;
	}
	public void setbTipoDeBateria(byte bTipoDeBateria) {
		this.bTipoDeBateria = bTipoDeBateria;
	}
	public int getiAutonomia() {
		return iAutonomia;
	}
	public void setiAutonomia(int iAutonomia) {
		this.iAutonomia = iAutonomia;
	}
	public float getfPeso() {
		return fPeso;
	}
	public void setfPeso(float fPeso) {
		this.fPeso = fPeso;
	}
	public float getfAlto() {
		return fAlto;
	}
	public void setfAlto(float fAlto) {
		this.fAlto = fAlto;
	}
	public float getfAncho() {
		return fAncho;
	}
	public void setfAncho(float fAncho) {
		this.fAncho = fAncho;
	}
	public float getfGrosor() {
		return fGrosor;
	}
	public void setfGrosor(float fGrosor) {
		this.fGrosor = fGrosor;
	}
	public void setsMarca(String sMarca) {
		this.sMarca = sMarca;
	}
	public String getsModelo() {
		return sModelo;
	}
	public void setsModelo(String sModelo) {
		this.sModelo = sModelo;
	}
	public boolean isbReproduceSonido() {
		return bReproduceSonido;
	}
	public void setbReproduceSonido(boolean bReproduceSonido) {
		this.bReproduceSonido = bReproduceSonido;
	}
	public boolean isbReproduceVideo() {
		return bReproduceVideo;
	}
	public void setbReproduceVideo(boolean bReproduceVideo) {
		this.bReproduceVideo = bReproduceVideo;
	}
	public byte getbTipoDeAlmacenamiento() {
		return bTipoDeAlmacenamiento;
	}
	public void setbTipoDeAlmacenamiento(byte bTipoDeAlmacenamiento) {
		this.bTipoDeAlmacenamiento = bTipoDeAlmacenamiento;
	}
	public byte getbPantalla() {
		return bPantalla;
	}
	public void setbPantalla(byte bPantalla) {
		this.bPantalla = bPantalla;
	}
	public int getiCapacidadDeAlmacenamiento() {
		return iCapacidadDeAlmacenamiento;
	}
	public void setiCapacidadDeAlmacenamiento(int iCapacidadDeAlmacenamiento) {
		this.iCapacidadDeAlmacenamiento = iCapacidadDeAlmacenamiento;
	}
	
	//ToString
	public String toString() {
		String sResultado="";
		sResultado+= "Marca: "+this.getsMarca()+"\n";
		sResultado+= "Modelo: "+this.getsModelo()+"\n";
		//sResultado+= "Reproductor de sonido: "+this.isbReproduceSonido()+"\n";
		//sResultado+= "Reproductor de video: "+this.isbReproduceVideo()+"\n";
		sResultado+= "Tipo de almacenamiento: "+this.getbTipoDeAlmacenamiento()+"\n";
		//sResultado+= "Capacidad de almacenamiento: "+this.getiCapacidadDeAlmacenamiento()+"\n";
		//sResultado+= "Pantalla: "+this.getbPantalla()+"\n";
		//sResultado+= "Tipo de bateria: "+this.getbTipoDeBateria()+"\n";
		//sResultado+= "Autonomia: "+this.getiAutonomia()+"\n";
		//sResultado+= "Peso: "+this.getfPeso()+"\n";
		//sResultado+= "Ancho: "+this.getfAncho()+"\n";
		//sResultado+= "Alto: "+this.getfAlto()+"\n";
		//sResultado+= "Grosor: "+this.getfGrosor()+"\n";
		return sResultado;
	}


}
