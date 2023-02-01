package tr.edu.acibadem.yova.OgrenciWebServisi;

public class ders {

	public ders(String isim, int dersId) {
		this.dersId = dersId;
		this.isim = isim;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getDersId() {
		return dersId;
	}

	public void setDersId(int dersId) {
		this.dersId = dersId;
	}

	private int dersId;
	private String isim;
}
