package tr.edu.acibadem.yova.OgrenciWebServisi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping()
public class Application {
	
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}
	
public static final virtualDb vDb = new virtualDb(); //burdan örnekleme aldım.
	
@PostMapping("/api/ogrEkle")	
public static String ogrEkle(@RequestBody ogr eklenecekOgr){
	
	if(eklenecekOgr==null) {
		return "eksik bilgi girildi, öğrenci kaydı başarısız";
	}
	vDb.ogrler.add(eklenecekOgr);
	return "öğrenci ekleme bişlemi başarılı";
}

@GetMapping("/api/ogrListele")	
public static List<ogr> ogrlistele(){
	return vDb.ogrListele();
}


@PostMapping("/api/dersEkle")
public static String dersEkle(@RequestBody ders eklenecekDers){
	if(eklenecekDers == null) {
		return "eksik bilgi girildi, ders ekleme işlemi  başarısız";
	}
	vDb.dersler.add(eklenecekDers);
	return "ders ekleme bişlemi başarılı";
}

@GetMapping("/api/dersListele")
public static List<ders> dersListele(){
	return vDb.dersListele();
}

@RequestMapping("/api/ogrDersEkle")
public static String ogrDersEkle(String ogrIsim, String dersAdi){
	if(ogrIsim == null || dersAdi == null || ogrIsim == "" || dersAdi == "") {
		return "eksik bilgi girildi, öğrenci ders seçim işlemi  başarısız";
	}
	vDb.ogrDersler.put(ogrIsim, dersAdi);
	return "ders ekleme bişlemi başarılı";
}

@GetMapping("/api/ogrDersListele")
public static Map<String,String> ogrDersListele(@RequestBody ogr Ogr){
	Map<String,String> ogrDersler = new HashMap<>();
	for(int i = 0; i<= vDb.ogrDersler.size();i++) {
			ogrDersler.put(Ogr.getIsim(), vDb.ogrDersler.get(Ogr.getIsim()));			
	}
	return ogrDersler;
}
}
	
