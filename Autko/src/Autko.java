import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Autko {
	Autko(){
		this.komputer=new Komputer();
String moj2;
		try 
		{
			BufferedReader czytacz=new BufferedReader(new FileReader("C:\\przebieg.txt"));
			while((moj2=czytacz.readLine())!=null)
			{
				przebieg_calkowity=Float.parseFloat(moj2);
			}	
		}
		catch (FileNotFoundException io)												
		{System.out.println(io.getMessage());}

		catch (IOException io)												
		{System.out.println(io.getMessage());} 
		
		
	}
	public Komputer komputer;
	private Silnik silnik=new Silnik();
	private UkladKierowniczy uklad = new UkladKierowniczy();
	
	public float przebieg_jazdy=0;
	public float przebieg_calkowity=0;
	
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

