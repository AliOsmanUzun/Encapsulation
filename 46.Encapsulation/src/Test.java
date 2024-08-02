import com.aliosman.model.Calisan;

public class Test {
	public static void main(String[] args) {
		
		Calisan person1 = new Calisan(1L,"Ali Osman","Uzun",14124.12);
		
	 person1.setId(1558L); // setId metodu ile person1 referans ismine sahip objemin setId metodunu kullanarak.
	 // ıd değişkenine değerimi atadım
	 
	 // Şimdide atadığım bu değere erişmek için getter metodunu kullanalım ve ekrana yazdıralım.
	 
	 System.out.println(person1.getId());
	 
	 
	 // Değişkenimi private ile saklayarak güvenliğini sağladım.
	 // Set metodu ile erişip değer atadım
	 // Get metodu ile bu değere erişip return ettim
	 // Setter metodum ile veri doğruluğunu ve tutarlılığını sağlıyorum
	 // Saçma veya geçersiz veri girişlerini engellemiş oluyorum.
	 // Bunu kullanma amacım diyelim ki yaş değişkenim var . Bu değişkenime değer alıcam ama eksi bir değer girilmesini istemiyorum.
	 // Bu yüzden setter metodunun içinde koşul yapıları kullanarak doğru veri girilmesini sağlıyorum.
	}
}
