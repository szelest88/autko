
public class Komputer {
private boolean enabled=false;
public void enable(){
	setEnabled(true);
}
public void disable(){
	setEnabled(false);
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}
public boolean isEnabled() {
	return enabled;
}
public float czas=0;
public float predkosc_srednia=0;
public float dystans=0;
public float predkosc_maksymalna=0;

}
