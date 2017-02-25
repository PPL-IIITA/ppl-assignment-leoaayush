package ppl;
//import java.util.Scanner; 
import java.io.*;
import java.util.*;
public class Main {


 	public static void main(String args[]) throws IOException
	{
		
			
			BufferedReader br;
			FileReader fr;
			fr=new FileReader("BoyInput.txt");
			br=new BufferedReader(fr);
			String s;
		
			
			  int  at, intl, bud,minat,type;
		       int  nb = Integer.parseInt(br.readLine());
		     
		       Boys[] b =new Boys[nb];
				int i;
				for(i=0;i<nb;i++)
				{
					b[i]=new Boys();
				}
				
		       
		       for (i = 0; i < nb; i++) {
		            s = br.readLine();
		            StringTokenizer st = new StringTokenizer(s, ",");
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
		    // System.out.println("Name is "+b[8].nameb);
		        
		       
		        
		        
			 
			
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
		 
		    commited[] c =new commited[ng+1];
			for(i=0;i<c.length;i++)
			{
				c[i]=new commited();
			}
			i=0;
			int j=0,k=0,d=0;
			for(i=0;i<g.length;i++)
			{	d=0;
				for(j=0;j<b.length;j++)
				{
					if(b[j].bud >= g[i].maintg && b[j].minattract <=g[i].attg)
					{
				//		d=idealman(g[i].choice,b,j);
					
						int max=0,maxindex=0,u;
						if(g[i].choice==1)
						{
							for(u=0;u<b.length;u++)
							{
								if(b[u].attb>max && b[u].flagb==0)
								{
								max=b[u].attb;
								maxindex=u;
								}
							}
							if(maxindex==j)
							d=1;
							
						}
			
						if(g[i].choice==2)
						{
							for(u=0;u<b.length;u++)
							{
								if(b[u].bud>max && b[u].flagb==0)
								{
								max=b[u].bud;
								maxindex=u;
								}
							}
							if(maxindex==j)
								d=1;
					
						}
					
						if(g[i].choice==3)
						{
							for(u=0;u<b.length;u++)
							{
								if(b[u].intelb>max && b[u].flagb==0)
								{
									max=b[u].intelb;
									maxindex=u;
								}
							}
							if(maxindex==j)
								d=1;
					
						}
			
			
			//		System.out.println("D is"+d+"Boy is "+b[j].nameb+"Girl is"+g[i].nameg);
			
					
					
					if(d==1 && b[j].flagb==0 && g[i].flagg==0){
						c[k].name1=b[j].nameb;
						c[k].name2=g[i].nameg;
						b[j].flagb=1;
						g[i].flagg=1;
						k++;
							if(k>g.length)
							{break;}
						}
					}
			
				}
			}
			
			
			File fp=new File("Output1.txt");
	         Boolean check;
			check=fp.createNewFile();
			FileWriter fw=new FileWriter("Output1.txt");
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
			}
				
			bw.close();
			fw.close();
	
	
			
		//	for(i=0;i<k;i++)
			//{
		//		System.out.println(c[i].name1+"is in a relationship with "+c[i].name2);
			//}
 				
 		
			 fr.close();
		        br.close();
		        fr1.close();
		        br1.close();
	
	}
	
	

	
	}








