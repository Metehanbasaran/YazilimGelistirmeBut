package tr.edu.acibadem.yova.OgrenciWebServisi;


public class ogr {
	
	public ogr(String isim, int dersId, int ogrId) {
		this.isim = isim;
		this.ogrId = ogrId;
	}

	public int getOgrId() {
		return ogrId;
	}

	public void setOgrId(int ogrId) {
		this.ogrId = ogrId;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}


	private int ogrId;
	private String isim;

}
