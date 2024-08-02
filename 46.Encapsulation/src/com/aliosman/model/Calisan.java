package com.aliosman.model;


public class Calisan {
   // Bu private değişkenlere değer atamanın dışarıdan 2 yolu var 
	
   // Constructorlar veya getter--setter metotları ile ( kapsülleme )
	
   // ALT + SHİFT + S ile bu yapıların kısayollarına ulaşabilirim
	
	// Setter metodlarım içerisinde belirli koşullar koyarak değişkenime saçma veya geçersiz bir veri girişi olmasını engelliyorum.
	// İstediğim değer aralığında veri girişi olmasını sağlıyorum. Buda veri doğruluğunu ve tutarlılığın sağlıyor
	private Long id;
	private String isim , soyisim;
	private double maas;
	
	public Calisan(Long id, String isim,String soyisim,double maas) {
		if (id<=0) {
			System.out.println("Lütfen geçerli bir id numarası giriniz");
		} else {
			this.id=id;
		}
		this.id=id;
		this.isim=isim;
		this.soyisim=soyisim;
		this.maas=maas;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}
	
	
	
	
}
