package pplq4;

import java.io.*;

import java.util.*;



/**
 * Main Class of the program , which executes all the functions
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
						c[k].btype=b[j].type;
						c[k].gtype=g[i].typeg;
						c[k].maintg=g[i].maintg;
						c[k].bud=b[j].bud;
						c[k].gintl=g[i].intelg;
						c[k].battr=b[j].attb;
						c[k].gatrr=g[i].attg;
						c[k].bintl=b[j].intelb;
						k++;
							if(k>g.length)
							{break;}
						}
			}
			
		}
	}
		//	for(i=0;i<k;i++)
			//{
				//System.out.println(c[i].name1+" is in a relationship with "+c[i].name2);
			//}
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
			}
				
			//bw.close();
		//	fw.close();
	

			BufferedReader br2;
			FileReader fr2;
			fr2=new FileReader("GIFTInput.txt");
			br2=new BufferedReader(fr2);
			String s2;
		//	Boys b1;
			
			  
		       int  nf = Integer.parseInt(br2.readLine());
		     
		       gifts[] f =new gifts[nf];
				
				for(i=0;i<nf;i++)
				{
					f[i]=new gifts();
				}
				
				int gifttype;
	//			int price;
		//		int value;
			//	int id;
		       for (i = 0; i < nf; i++) {
		            s2 = br2.readLine();
		            StringTokenizer st2 = new StringTokenizer(s2, ",");
		           // String name = st.nextToken();
		            f[i].giftname=st2.nextToken();
		            gifttype = Integer.parseInt(st2.nextToken());
		           f[i].gifttype=gifttype;
		            f[i].price = Integer.parseInt(st2.nextToken());
		            
		            f[i].value = Integer.parseInt(st2.nextToken());
		            
		           
		           
		        }
			
			
			
			
			
		       File fp1=new File("Output4.txt");
			    Boolean check1;
				check1=fp.createNewFile();
				FileWriter fw1=new FileWriter("Output4.txt");
				BufferedWriter bw1=new BufferedWriter(fw1);
			
			
			
			
			
			bw.write("Gifting Description");
			bw.newLine();
	//		bw1.write("Gifting Description");
		//	bw1.newLine();
			//boys happiness + gifting 
			int cost =0,z=-1,l;
		
			String name;
			for(i=0;i<k;i++)
			{   name=c[i].name2;
				cost=0;
				z=-1;
				for(l=0;l<g.length;l++)
				{
					if(name==g[l].nameg)
						break;
				}
				
				c[i].gindex=l;
			
				if(c[i].btype==1)
				{
					while(cost<=c[i].maintg)
					{
						if(f[++z].status==0)
						{cost=cost+f[z].price;
						f[z].status=1;
						if(f[z].gifttype==2)
						{
							c[i].luxtotal=c[i].luxtotal+cost;
						}
						bw.write(c[i].name1+" gifts "+c[i].name2+" withname "+f[z].giftname);
						bw.newLine();	
						
			//			bw1.write(c[i].name1+" gifts "+c[i].name2+" withname "+f[z].giftname);
				//		bw1.newLine();	
						}
						else 
							z++;
					
					}
					g[c[i].gindex].totalcost=cost;
					c[i].bhap=c[i].bud-cost;
				}
				
				if(c[i].btype==2)
				{
					while(cost<=c[i].bud)
					{
						if(f[++z].status==0){
						cost=cost+f[z].price;
						if(f[z].gifttype==2)
						{
							c[i].luxtotal=c[i].luxtotal+cost;
						}
						bw.write(c[i].name1+" gifts "+c[i].name2+" withname "+f[z].giftname);
						bw.newLine();	
						
					//	bw1.write(c[i].name1+" gifts "+c[i].name2+" withname "+f[z].giftname);
					//	bw1.newLine();	
						}
						else
							z++;
					}
					g[c[i].gindex].totalcost=cost;
					//c[k].bhap=c[k].ghap;
				}
				
				if(c[i].btype==3)
				{
					while(cost<=c[i].maintg)
					{
						if(f[++z].status==0){
						cost=cost+f[z].price;
						if(f[z].gifttype==2)
						{
							c[i].luxtotal=c[i].luxtotal+cost;
						}
						bw.write(c[i].name1+" gifts "+c[i].name2+" withname "+f[z].giftname);
						bw.newLine();	
						
					//	bw1.write(c[i].name1+" gifts "+c[i].name2+" withname "+f[z].giftname);
					//	bw1.newLine();	
						}
						else
							z++;
					}
					while(f[z].gifttype!=2) {
						z++;
					}
					if((c[i].bud-cost)>=f[z].price)
					{
						bw.write("Additionally " +c[i].name1+" gifts "+c[i].name2+" withname "+f[z].giftname);
							bw.newLine();
					
						//	bw1.write("Additionally " +c[i].name1+" gifts "+c[i].name2+" withname "+f[z].giftname);
						//	bw1.newLine();
					
					}	
					g[c[i].gindex].totalcost=cost;	
					c[i].bhap=c[i].gintl;	
			
				}
				
					
			
			
			
			}
			int valtotal=0;
			for(i=0;i<f.length;i++)
			{
				valtotal=valtotal+f[i].value;
			}
			//girl happiness
			for(i=0;i<k;i++)
			{
					if(c[i].gtype==1)
					{
						
						c[i].ghap=(float) (Math.log(g[c[i].gindex].totalcost - c[i].maintg) +2*c[i].luxtotal);
						
						
					}
				
					if(c[i].gtype==2)
					{
						
						c[i].ghap= g[c[i].gindex].totalcost - c[i].maintg + valtotal;
					}
				
				
					if(c[i].gtype==3)
					{
						
						c[i].ghap=(float)Math.exp(g[c[i].gindex].totalcost - c[i].maintg);
						
					}
			}
			//String name12
			for(i=0;i<k;i++)
			{
				if(c[i].btype==2)
				{
			
					c[i].bhap=c[i].ghap;
					
				}
			}
			
			int x=3;
			float min=0;
			int minindex=-1;
			for(i=0;i<k;i++)
			{
				c[i].happiness=c[i].bhap + c[i].ghap;
			}
		//	System.out.println("Happiness of "+c[4].name1+"is" +c[4].happiness);
		//	bw1.write("Let k=3");
//			bw1.newLine();
	//		bw.newLine();
			bw.write("Breakups");
			bw.newLine();
			//		bw1.write("least Happiest Couples");
	//		bw1.newLine();
			int m=0;
		for(int p=0;p<k;p++)
		
		
		{	
			min=9999;
			minindex=0;
			for(i=0;i<k;i++)
			{
				if(c[i].happiness<min && c[i].hflag==0)
				{
					min=c[i].happiness;
					minindex=i;
				}
			
			}
			if(m>=x)
				break;
			m++;
			if(c[minindex].hflag==0){
			bw.write(c[minindex].name1 +"is breaking up with  "+c[minindex].name2);}
			bw.newLine();
			//log FILE ENTRY
			c[minindex].name1=" ";
			
			int q;
			for(q=0;q<b.length;q++)
			{ d=0;
				if(b[q].flagb==0)
				{
					if(b[q].bud >= c[minindex].maintg && b[q].minattract <=c[minindex].gatrr)
					{
						d=1;
							
						}				}		
					
					if(d==1 ){
						c[minindex].name1=b[q].nameb;
				
						b[q].flagb=1;
				
						c[minindex].btype=b[q].type;
										c[minindex].bud=b[q].bud;
				
						c[minindex].battr=b[q].attb;
										c[minindex].bintl=b[q].intelb;
		//								bw1.newLine();
										if(c[minindex].hflag==0){
										bw1.write(c[minindex].name1 +" is in a new relationship with  "+c[minindex].name2);
										}
										c[minindex].hflag=1;		
										break;				
					}
					
			
			}
			
			
			
			bw1.newLine();
			
			
			c[minindex].hflag=1;	
		
		}
	//		System.out.println("1st is "+c[0].name1 + "and"+c[0].name2);
			
	
		
			
			
//			scan.close();
			bw.close();
			fw.close();
			bw1.close();
			fw1.close();
			br.close();
	fr.close();
	br1.close();
	fr1.close();
	br2.close();
	fr2.close();
	
	}
	
	

	
	}








