
public class Fenerbahce extends Futbol implements Koc {

	
	public Fenerbahce(String takımAdı,int kurulduguTarih  ){
		
		super(takımAdı, kurulduguTarih);
		
		
	}
	
	public void EkranaYaz() {
		
		System.out.println("Takım adı: "+takımAdı +"Kurulduğu Tarih: " + kurulduguTarih);
	}

	@Override
	public void molaVer() {
		
		System.out.println("15 dakika mola verildi");
		
	}

}
