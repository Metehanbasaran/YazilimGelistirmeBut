package tr.edu.acibadem.yova.OgrenciWebServisi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class virtualDb {
		
	
	List<ders> dersler = new ArrayList();
	List<ogr> ogrler = new ArrayList();
	Map<String,String> ogrDersler = new HashMap<>();
	
	public List<ogr> ogrListele(){
		return ogrler;
	}
	
	public List<ders> dersListele(){
		return dersler;
	}
	
	public Map<String,String> ogrDersListele(){
		return ogrDersler;
	}
}
