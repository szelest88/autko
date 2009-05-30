
public class Silnik {
	
private float predkosc=0;

public void setPredkosc(float predkosc) {
	this.predkosc = predkosc;
}
public float getPredkosc(){
	return predkosc;
}
public void zwiekszPredkosc(){
	if(predkosc<200)
		predkosc+=1;
}

public void zmniejszPredkosc(){
	if(predkosc>0)
		predkosc-=1;
}


private int obroty=0;

public void setObroty(int obroty) {
	this.obroty = obroty;
}
public int getObroty(){
	return obroty;
}
public void zwiekszObroty(){
	obroty=(int)(90*(((predkosc)-1)%40+1));
}

}