
public interface IReproductorAudio {
	//CONSTANTES
		//TIPO DE ALMACENAMIENTO
		public final byte CD=1;
		public final byte DVD=2;
		public final byte MEMORIAFLASH=3;
		public final byte MINIDISK=4;
		//PANTALLA
		public final byte NINGUNA=5;
		public final byte TEXTO=6;
		public final byte MONOCROMO=7;
		public final byte COLOR=8;
		//TIPO DE BATERIA
		public final byte PILAS=9;
		public final byte LI_LION=10;
		

		public String getsMarca();
		public byte getbTipoDeBateria();
		public void setbTipoDeBateria(byte bTipoDeBateria);
		public int getiAutonomia();
		public void setiAutonomia(int iAutonomia);
		public float getfPeso();
		public void setfPeso(float fPeso);
		public float getfAlto();
		public void setfAlto(float fAlto);
		public float getfAncho();
		public void setfAncho(float fAncho);
		public float getfGrosor();
		public void setfGrosor(float fGrosor);
		public void setsMarca(String sMarca) ;
		public String getsModelo();
		public void setsModelo(String sModelo);
		public boolean isbReproduceSonido();
		public void setbReproduceSonido(boolean bReproduceSonido);
		public boolean isbReproduceVideo();
		public void setbReproduceVideo(boolean bReproduceVideo);
		public byte getbTipoDeAlmacenamiento();
		public void setbTipoDeAlmacenamiento(byte bTipoDeAlmacenamiento);
		public byte getbPantalla();
		public void setbPantalla(byte bPantalla);
		public int getiCapacidadDeAlmacenamiento();
		public void setiCapacidadDeAlmacenamiento(int iCapacidadDeAlmacenamiento);
		public boolean isbReproduceAudioCds();
		public void setbReproduceAudioCds(boolean bReproduceAudioCds);
		public boolean isbReproduceMP3();
		public void setbReproduceMP3(boolean bReproduceMP3);
		public boolean isbReproduceWMA();
		public void setbReproduceWMA(boolean bReproduceWMA);
		public boolean isbReproduceVorbis();
		public void setbReproduceVorbis(boolean bReproduceVorbis);
		public boolean isbAccesoPorCarpetas();
		public void setbAccesoPorCarpetas(boolean bAccesoPorCarpetas);
		public boolean isbRadio();
		public void setbRadio(boolean bRadio);
		public boolean isbGrabacionDeVoz();
		public void setbGrabacionDeVoz(boolean bGrabacionDeVoz);
}
