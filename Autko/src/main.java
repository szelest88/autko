//import java.awt.*; //
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.KeyEvent; //KEY!!!!!!!!
//import java.awt.event.KeyListener; //KEY!!!!!!!
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;

import javax.swing.*;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WATKI
//		Autko moje=new Autko();
//		boolean flaga=false;
		Okno okno = new Okno();
		//KONIEC WATKOW
		
		
		Runnable odpalacz=new PingRunnable(okno);
		Thread watek=new Thread(odpalacz);
		watek.start();
		
		
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//okno.show();
		okno.setVisible(true);
		
		

	}

}



