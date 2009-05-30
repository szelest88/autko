//import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.geom.Ellipse2D;
//import java.awt.geom.Line2D;
//import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;


public class Miernik extends JPanel {
	Autko auto;
	public Miernik(Autko arg){
		auto=arg;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		float predkosc_max=200;
		g.clearRect(390, 90, 110, 110);//hm?
		
		g.setColor(Color.blue);
		g.drawArc(390, 90, 110, 110, 180,360);
		g.setColor(Color.red);
	
		
		for(int i=0;i<20;i++)
			g.drawArc(400+i,100+i,90-2*i,90-2*i,(int)(180-180*((auto.getPredkosc())/predkosc_max)),2);
	
		float obroty_max=3500;
		g.clearRect(500, 90, 110, 110);//hm?
		
		g.setColor(Color.blue);
		g.drawArc(500, 90, 110, 110, 180,360);
		g.setColor(Color.red);
	
		
		for(int i=0;i<20;i++)
			g.drawArc(510+i,100+i,90-2*i,90-2*i,(int)(180-180*((auto.getObroty())/obroty_max)),2);
		
		
		repaint();
	}
}
