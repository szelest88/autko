import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class PingRunnable implements Runnable{

				Okno okienko=new Okno();//
				Komputer moj_komputer;
				
				//boolean zapis=true;//czy zapisywac do pliku
				
				PingRunnable(Okno okienko){
					this.okienko=okienko;
					moj_komputer=okienko.moje.komputer;
				System.out.println(okienko.moje.getPredkosc());	
				}
				public void run() {
					if(okienko.zapis==true)
				{
					//ODCZYYYYYYYYT
					String moj2;
					int wart=0;
					try 
					{
						BufferedReader czytacz=new BufferedReader(new FileReader("C:\\log.txt"));
						while((moj2=czytacz.readLine())!=null)
						{	
							try
						{
							Thread.sleep(100);
						}catch(InterruptedException e){}
						{
						if(wart%4==1){	
							System.out.println(moj2);
							//okienko.moje.przebieg_jazdy=Float.parseFloat(moj2);
							okienko.moje.setPredkosc(Float.parseFloat(moj2));
							okienko.repaint();
							
						}
						}if(wart%4==2){
							okienko.moje.przebieg_jazdy=Float.parseFloat(moj2);
							okienko.repaint();
										
						}
						if(wart%4==3){
							okienko.moje.setObroty(Integer.parseInt(moj2));
							okienko.repaint();
										
						}
						if(moj2.contains("LEWA")){okienko.moje.skrecaj(-1);okienko.repaint();}
						else if(moj2.contains("PRAWA")){okienko.moje.skrecaj(1);okienko.repaint();}
						wart++;
						}
						
					}
					catch (FileNotFoundException io)												
					{System.out.println(io.getMessage());}

					catch (IOException io)												
					{System.out.println(io.getMessage());} 
					}else
			//KONIEC ODCZYTU
					{
					
					// TODO Auto-generated method stub
					try
					{
						while(okienko.zapis==false)
						{
							okienko.repaint();
							Thread.sleep(200);
							
						//	if(moj_komputer.enabled)
					//		{
							moj_komputer.czas+=0.1;
							moj_komputer.dystans+=this.okienko.moje.getPredkosc()*0.1;		//jakoœ skalibrowaæ
							moj_komputer.predkosc_srednia=	(float) (moj_komputer.predkosc_srednia*(moj_komputer.czas-0.1)+
															this.okienko.moje.getPredkosc()*0.1)*(1/(moj_komputer.czas));
							if(moj_komputer.predkosc_maksymalna<this.okienko.moje.getPredkosc())
								moj_komputer.predkosc_maksymalna=(float)(this.okienko.moje.getPredkosc());
							System.out.println("MAX:"+moj_komputer.predkosc_maksymalna);
							System.out.println("PR_SRED"+moj_komputer.predkosc_srednia);
						//	}
							
							System.out.print("PRÊDKOŒÆ: ");
							System.out.println(this.okienko.moje.getPredkosc());
							this.okienko.moje.przebieg_jazdy+=this.okienko.moje.getPredkosc()*0.1; 	//ten wspó³czynnik jest na czuja, trzeba bêdzie to
									
									System.out.print("PRZEBIEG: ");
							System.out.println(this.okienko.moje.przebieg_jazdy);
							
							System.out.print("OBROTY: ");
							System.out.println(this.okienko.moje.getObroty());
							
							if(this.okienko.moje.is_kier_lewy())System.out.println("PRAWA");
							if(this.okienko.moje.is_kier_prawy())System.out.println("LEWA");
							//ZAPIS DO PLIKU

							try
								{
								BufferedWriter pisacz =new BufferedWriter(new FileWriter("C:\\log.txt",true));
								pisacz.newLine();
								String str_pr=Float.toString(this.okienko.moje.getPredkosc());
								pisacz.write(str_pr);
								pisacz.newLine();
								String str_prz=Float.toString(this.okienko.moje.przebieg_jazdy);
								pisacz.write(str_prz);
								pisacz.newLine();
								String str_obr=Integer.toString(this.okienko.moje.getObroty());
								pisacz.write(str_obr);
								pisacz.newLine();
								if(this.okienko.moje.is_kier_lewy())pisacz.write("PRAWA");
								if(this.okienko.moje.is_kier_prawy())pisacz.write("LEWA");
								pisacz.close();
								}
							catch (IOException io)												
								{System.out.println(io.getMessage());}

							catch (Exception se)
								{System.err.println("B³¹d se");}
						}
							//KONIEC ZAPISU
							
							//odczyt
									
							
						}
					
					catch(InterruptedException e)
					{
						
					}
					}
				}

			}

	
//!!!!!!!!!!!!!!
