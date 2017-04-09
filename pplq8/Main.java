package pplq8;

import java.io.*;

import java.util.*;





/**
 * Main Class of question 8
 * @author Aayush
 *
 */

 
public class Main {


 	/**
 	 * Main function of question 8
 	 * @param args
 	 * @throws IOException
 	 */
 	
 	public static void main(String args[]) throws IOException 
	{
 		
 		BufferedReader br3;
		FileReader fr3;
		fr3=new FileReader("BoyInput.txt");//Take input from boy input file
		br3=new BufferedReader(fr3);
		String s;
	//	Boys b1;
		
		  int  at, intl, bud,minat,type;
	       int  nb = Integer.parseInt(br3.readLine());
	 
	    
	       Boys[] b =new Boys[nb];
			int i;
			for(i=0;i<nb;i++)
			{
				b[i]=new Boys();//Allocate Memory for boys
			}
			
	       
	       for (i = 0; i < nb; i++) {// Reading and storing all values from file respectively
		        
	            s = br3.readLine();
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
	     
			
	       BufferedReader br4;
			FileReader fr4;
			fr4=new FileReader("GirlInput.txt");// Reading girl input's text file
			br4=new BufferedReader(fr4);
			String s1;
		//	Boys b1;
			
			  int  atg, intlg, maing,typeg,choice;
		       int  ng = Integer.parseInt(br4.readLine());
		     
		       pplq8.Girls[] g =new pplq8.Girls[ng];
				
				for(i=0;i<ng;i++){
//Allocating memory for girls				{
					g[i]=new pplq8.Girls();
				}
				
		       
		       for (i = 0; i < ng; i++) {// Storing all values of girl's from text file respectively
		            s1 = br4.readLine();
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
				{ //checking suitable boy for each girl
					if(b[j].bud >= g[i].maintg && b[j].minattract <=g[i].attg)
					{
				//		d=idealman(g[i].choice,b,j);
						//compiler comes here only if boy's budget is greater than girl's maintainence and if the girl satisfies the minimum attractiveness requirements of the boy
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
 		
 		
 		
 		
 		
 		BufferedReader br;
		FileReader fr;
		fr=new FileReader("Coupleq2.txt");
		br=new BufferedReader(fr);
	
	//	Boys b1;
		int  nc = Integer.parseInt(br.readLine());;
		 int i1,j1;
		File fp5=new File("Output8.txt");
		 //   Boolean check;
		//	check=fp.createNewFile();
			FileWriter fw5=new FileWriter("Output8.txt");
			BufferedWriter bw5=new BufferedWriter(fw5);
				
			
			
		
			
			
			
			
		
			 File fp=new File("Log.txt");
			 //   Boolean check;
			//	check=fp.createNewFile();
				FileWriter fw1=new FileWriter("Log.txt");
				BufferedWriter bw1=new BufferedWriter(fw1);
			//	bw.write(Integer.toString(k));
			//	bw.newLine(); 
			 
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
				

			 type=2;//0 or 1 - default gifting , 2-special gifting
			 
			 if(type==0 || type==1){
				 
				 
				 					
				 					bw1.write("Default Choice");
									bw1.newLine();
									bw5.write("Default Choice");
									bw5.newLine();
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
												bw5.write(c[i].name1+" gifts "+c[i].name2+" with "+f[z].giftname);
												bw5.newLine();	
												
												bw1.write(c[i].name1+" gifts "+c[i].name2+" with "+f[z].giftname);
												bw1.newLine();	
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
												bw5.write(c[i].name1+" gifts "+c[i].name2+" with "+f[z].giftname);
												bw5.newLine();	
												
												bw1.write(c[i].name1+" gifts "+c[i].name2+" with "+f[z].giftname);
												bw1.newLine();	
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
												bw5.write(c[i].name1+" gifts "+c[i].name2+" with "+f[z].giftname);
												bw5.newLine();	
												
												bw1.write(c[i].name1+" gifts "+c[i].name2+" with "+f[z].giftname);
												bw1.newLine();	
												}
												else
													z++;
											}
											while(f[z].gifttype!=2) {
												z++;
											}
											if((c[i].bud-cost)>=f[z].price)
											{
												bw5.write("Additionally " +c[i].name1+" gifts "+c[i].name2+" with "+f[z].giftname);
													bw5.newLine();
											
													bw1.write("Additionally " +c[i].name1+" gifts "+c[i].name2+" with "+f[z].giftname);
													bw1.newLine();
											
											}	
											g[c[i].gindex].totalcost=cost;	
											c[i].bhap=c[i].gintl;	
									
										}
						
								}
			 }
			else{
						
										
											
											bw5.write("Alternate choice");
											bw5.newLine();
											bw1.write("Alternate choice");
											bw1.newLine();
											for(i=0;i<k;i++)
											{
												
												
												for(int k1=0;k1<nf;k1++)
												{
														if(f[k1].gifttype==1 && f[k1].status==0){
															bw5.write(c[i].name1 + " gifts "+c[i].name2 + " with gift "+f[k1].giftname );
															bw5.newLine();
									
															bw1.write(c[i].name1 + " gifts "+c[i].name2 + " with gifts of type 1,2and 3 ");
															bw1.newLine();
															f[k1].status=1;
															break;
														}
												}
						
												for(int k1=0;k1<nf;k1++){
													
																if(f[k1].gifttype==2 && f[k1].status==0){
													
																		bw5.write(c[i].name1 + " gifts "+c[i].name2 + " with gift "+f[k1].giftname );
																		bw5.newLine();
																		
																		bw1.write(c[i].name1 + " gifts "+c[i].name2 + " with gifts of type 1,2and 3 ");
																		bw1.newLine();
																		f[k1].status=1;
																		break;
																	}
													}
							
								
												for(int k1=0;k1<nf;k1++){
													
													
																if(f[k1].gifttype==3 && f[k1].status==0){
													
													
																		bw5.write(c[i].name1 + " gifts "+c[i].name2 + " with gift "+f[k1].giftname );
																		bw5.newLine();
										
																		bw1.write(c[i].name1 + " gifts "+c[i].name2 + " with gifts of type 1,2and 3 ");
																		bw1.newLine();
																		f[k1].status=1;
																		break;
																	}
													}
							
							
						
										}
				
	
	
			}
	
			 bw5.close();
			 bw1.close();
			 br.close();
			 br2.close();
			 br3.close();
			 br4.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
			
										
	}
					
			
			
			
			
							
			
			
			
			
			
			
			
			
			
			
	
	









