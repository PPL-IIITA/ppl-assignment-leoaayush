package pplq5;

import java.io.*;

import java.util.*;



/**
 * Main class of question 5 
 * @author Aayush
 *
 */

 
public class Main {


 	/**
 	 * @param args
 	 * @throws IOException
 	 */
 	public static void main(String args[]) throws IOException
	{
 		BufferedReader br;
		FileReader fr;
		fr=new FileReader("BoyInput.txt");
		br=new BufferedReader(fr);
		String s;
	//	Boys b1;
		
		  int  at, intl, bud,minat,type;
	       int  nb = Integer.parseInt(br.readLine());
	     
	       Boys[] b =new Boys[nb];
			int i;
			for(i=0;i<nb;i++)
			{
				b[i]=new Boys();
			}
			
	       Boys t = new Boys();
	       Boys t1 = new Boys();
	       for (i = 0; i < nb; i++) {
	            s = br.readLine();
	            StringTokenizer st = new StringTokenizer(s, ",");
	           // String name = st.nextToken();
	            b[i].nameb=st.nextToken();
	            at = Integer.parseInt(st.nextToken());
	           b[i].attb=at;
	            intl = Integer.parseInt(st.nextToken());
	            b[i].intelb=intl;
	            bud = Integer.parseInt(st.nextToken());
	            b[i].bud=bud;
	            minat=Integer.parseInt(st.nextToken());
	            b[i].minattract=minat;
	            type=Integer.parseInt(st.nextToken());
	            b[i].type=type;
	      }
	     int j;
	     for(i=0;i<nb;i++)
	     {
	    	 t=b[i];
	    	 for(j=0;j<nb;j++)
	    	 {
	    		 if(b[j].attb <= t.attb)
	    		 {
	    			 t1=t;
	    			 t=b[j];
	    			 b[j]=t1;
	    		 }
	    		 
	    	 }
	     }
			int f1=0,f=0;
	       BufferedReader br1;
			FileReader fr1;
			fr1=new FileReader("GirlInput.txt");
			br1=new BufferedReader(fr1);
			String s1;
		//	Boys b1;
			
			  int  atg, intlg, maing,typeg,choice;
		       int  ng = Integer.parseInt(br1.readLine());
		     
		       Girls[] g =new Girls[ng];
				
				for(i=0;i<ng;i++)
				{
					g[i]=new Girls();
				}
				
				Girls t2 =new Girls();
				Girls t3 =new Girls();
		       for (i = 0; i < ng; i++) {
		            s1 = br1.readLine();
		            StringTokenizer st1 = new StringTokenizer(s1, ",");
		           // String name = st.nextToken();
		            g[i].nameg=st1.nextToken();
		            atg = Integer.parseInt(st1.nextToken());
		           g[i].attg=atg;
		            intlg = Integer.parseInt(st1.nextToken());
		            g[i].intelg=intlg;
		            maing = Integer.parseInt(st1.nextToken());
		            g[i].maintg=maing;
		            choice=Integer.parseInt(st1.nextToken());
		            g[i].choice=choice;
		            typeg=Integer.parseInt(st1.nextToken());
		            g[i].typeg=typeg;
		           
		        }
			
		       for(i=0;i<ng;i++)
			     {
			    	 t2=g[i];
			    	 for(j=0;j<ng;j++)
			    	 {
			    		 if(g[j].maintg <= t2.maintg)
			    		 {
			    			 t3=t2;
			    			 t2=g[j];
			    			 g[j]=t3;
			    		 }
			    		 
			    	 }
			     }
			
		       commited[] c =new commited[ng+1];
			for(i=0;i<c.length;i++)
			{
				c[i]=new commited();
			}
			i=0;
			j=0;
			int k=0,d=0;
			for(i=0;i<g.length;i++)
			{	
				
				
				
				
				
			if(d%2==0)
				
			{	
				for(int k2=0;k2<g.length;k2++)
				{
					if(g[k2].flagg==0)
					{
						f=k2;
						break;
					}
				}
				
				for(j=0;j<b.length;j++)
				{
					if(b[j].bud >= g[f].maintg )
					{
		
			
						if( b[j].flagb==0 && g[f].flagg==0){
						c[k].name1=b[j].nameb;
						c[k].name2=g[f].nameg;
						b[j].flagb=1;
						g[f].flagg=1;
						c[k].btype=b[j].type;
						c[k].gtype=g[f].typeg;
						c[k].maintg=g[f].maintg;
						c[k].bud=b[j].bud;
						c[k].gintl=g[f].intelg;
						c[k].battr=b[j].attb;
						c[k].gatrr=g[f].attg;
						c[k].bintl=b[j].intelb;
						k++;
						d++;
							//	if(k>g.length)
						//	{break;}
						}
			}
			
		}

		
					}
		
			else
			{	
				
						int max=0,maxindex=0;
				
				for(int k1=0;k1<b.length;k1++)
				{
					if(b[k1].flagb==0)
					{
						f1=k1;
						break;
					}
				}
				
				for(j=0;j<g.length;j++)
				{
					if(g[j].attg>max && g[j].flagg==0)
					{
						max=g[j].attg;
						maxindex=j;
					
					}
					}
		//		System.out.println(g[maxindex].nameg);			
			
						if( b[f1].flagb==0 && g[maxindex].flagg==0){
						c[k].name1=b[f1].nameb;
						c[k].name2=g[maxindex].nameg;
						b[f1].flagb=1;
						g[maxindex].flagg=1;
						c[k].btype=b[f1].type;
						c[k].gtype=g[maxindex].typeg;
						c[k].maintg=g[maxindex].maintg;
						c[k].bud=b[f1].bud;
						c[k].gintl=g[maxindex].intelg;
						c[k].battr=b[f1].attb;
						c[k].gatrr=g[maxindex].attg;
						c[k].bintl=b[f1].intelb;
						k++;
									
						d++;
						
					//	if(k>g.length)
						//	{break;}
						}
			
			
			
			
						
						
			
			}
			
		}
	
				
				
				
				
				
			
				
			
			 File fp1=new File("Output5.txt");
			    Boolean check1;
				check1=fp1.createNewFile();
				FileWriter fw1=new FileWriter("Output5.txt");
				BufferedWriter bw1=new BufferedWriter(fw1);
			
			
						
			
			
			
			
			
			File fp=new File("Log.txt");
		 //   Boolean check;
		//	check=fp.createNewFile();
			FileWriter fw=new FileWriter("Log.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(Integer.toString(k));
			bw.newLine(); 
			for(i=0;i<k;i++)
			{
				String s3;
				String s2;
				s3=c[i].name1;
				s2=c[i].name2;
				bw.write(s3);
				bw.write(" is in a relationship with ");
				bw.write(s2);
				bw.newLine();
				bw1.write(s3);
				bw1.write(" is in a relationship with ");
				bw1.write(s2);
				bw1.newLine();
			
			}
				
			//bw.close();
		//	fw.close();
	

				

			
			
			
			
			
		      
			
			
			
			
			
			
//			scan.close();
			bw.close();
			fw.close();
			bw1.close();
			fw1.close();
			br.close();
	fr.close();
	br1.close();
	fr1.close();
//	br2.close();
//	fr2.close();
	
	}
	
	

	
	}








