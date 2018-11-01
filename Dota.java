public class Dota extends Game{
	
	public String posisi;

	public Dota(String namaHero, String posisi){
		super(namaHero);		
		this.posisi = posisi;
	}

	public Dota(String namaHero){
		super(namaHero);
	}

	public void showPosisi(){
		System.out.println(posisi);
	}

}