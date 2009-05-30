
public class UkladKierowniczy {

	boolean kier_lewy=false;
	boolean kier_prawy=false;
	
	
	public boolean isKier_lewy() {
		return kier_lewy;
	}
	public void setKier_lewy(boolean kier_lewy) {
		this.kier_lewy = kier_lewy;
	}
	public boolean isKier_prawy() {
		return kier_prawy;
	}
	public void setKier_prawy(boolean kier_prawy) {
		this.kier_prawy = kier_prawy;
	}

	public void skrecaj(int kier){ //
		if(kier==0){kier_prawy=false;kier_lewy=false;}
		if(kier==1){kier_prawy=false;kier_lewy=true;}
		if(kier==-1){kier_lewy=false;kier_prawy=true;}
		
	}
}