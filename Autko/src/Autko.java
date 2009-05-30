
public class Autko {
	Autko(){
		this.komputer=new Komputer();
	}
	public Komputer komputer;
	private Silnik silnik=new Silnik();
	private UkladKierowniczy uklad = new UkladKierowniczy();
	
	public float przebieg_jazdy=0;
	
	public float getPredkosc() {	
		return silnik.getPredkosc();
		
	}
	
	public int getObroty() {
		return silnik.getObroty();

	}
	public void setObroty(int ob) {
		silnik.setObroty(ob);

	}
	public void setPredkosc(float ob) {
		silnik.setPredkosc(ob);

	}

	public void gazuj(){	
		silnik.zwiekszPredkosc();
		silnik.zwiekszObroty();
		skrecaj(0);
	}
	public void hamuj(){
		silnik.zmniejszPredkosc();
		silnik.zwiekszObroty();
	}
	
	public void skrecaj(int kier){ //
		uklad.skrecaj(kier);
	}
	public boolean is_kier_lewy(){
		return uklad.isKier_lewy();
	}
	public boolean is_kier_prawy(){
		return uklad.isKier_prawy();
	}
	
}

