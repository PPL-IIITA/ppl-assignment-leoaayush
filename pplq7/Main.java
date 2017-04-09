package pplq7;

import java.io.*;

import java.util.*;




/**
 * Main Class of question 7
 * @author Aayush
 *
 */
 
public class Main {


 	
	/**
	 * Calculates the hash value ( this is the hash calculating function)
	 * @param s
	 * boy name whose hash value has to be found
	 * @return hash value
	 */
 	public static int hash(String s)
 	{
 		int a;
 		a=s.charAt(5);
 		int b;
 	//	if((s.charAt()))
 	//		b=s.charAt(5);
 	//	else
 		b=s.charAt(4);	
 		//System.out.println(s.charAt(4));
 		return a+b;
 	}
	/**
	 * Function for binary search in a sorted array
	 * @param a 
	 * boy name to be searched in the sorted list 
	 * @param c1
	 * array of objects of commited class
	 * @param l
	 * lower index
	 * @param u
	 * upper index
	 * @return
	 *if found return index else returns -1	
	 */
	public static int binarysearch(String a, commited[] c1,int l ,int u)
	{
		
		if(l>u)
		 return -1;
		else{
		int mid=(l+((u-l)/2));
	//	System.out.println("A is " +a);
	//	System.out.println("Mid one is"+c1[mid].name1 );
		if(a==c1[mid].name1)
		{return mid;}	
		
		else if((a.compareTo(c1[mid].name1))>0)
		{
			binarysearch(a,c1,mid+1,u);
		}
		
		else{
			binarysearch(a,c1,l,mid);
		}
		}
	
	return -1;
	}
 /**
  * Main function
  * @param args
  * @throws IOException
  */
	public static void main(String args[]) throws IOException
	{
 		BufferedReader br;
		FileReader fr;
		fr=new FileReader("Coupleq2.txt");
		br=new BufferedReader(fr);
		String s;
	//	Boys b1;
		int  nc = Integer.parseInt(br.readLine());;
		int i,k,i1,j1;
		File fp5=new File("Output7.txt");
		 //   Boolean check;
		//	check=fp.createNewFile();
			FileWriter fw5=new FileWriter("Output7.txt");
			BufferedWriter bw5=new BufferedWriter(fw5);
				
			
			
		
			
			
			
			
		
			commited[] c =new commited[nc+1];
			commited[] c1 =new commited[nc+1];
			for( i=0;i<nc;i++)
			{
				c[i]=new commited();
				c1[i]=new commited();
			}
			String s1, s2;
			i=0;
			 for (i = 0; i < nc; i++) {// Reading and storing all values from file respectively
			        
		            s1 = br.readLine();
		            StringTokenizer st = new StringTokenizer(s1, " ");
		           // String name = st.nextToken();
		            c[i].name1=st.nextToken();
		            c[i].name2 =st.nextToken();
		           c1[i]=c[i];
		            
		      }	
			//	System.out.println(c1[0].name2);
				//StringTokenizer st = new StringTokenizer(s1," ");
			//	s2=st.nextToken();
			
			
			
			
			
			//SORTED ARRAY STORING
				commited a1=new commited();
			
				for( i1=0;i1<nc;i1++)
				{
					for( j1=0;j1<nc;j1++)
					{
						
						if(c1[i1].name1.compareTo(c1[j1].name1)<0)
						{
							a1=c1[i1];
							c1[i1]=c1[j1];
							c1[j1]=a1;
							
						}
						
						
					}
				}
			//	System.out.println(c1[1].name1); 
		//HashTable Sorting			
				
				commited[] h1 = new commited[1000];
				for(i=0;i<h1.length;i++)
				{
					h1[i]=new commited();
				}
				for(i=0;i<nc;i++)
				{
					
					int a;
					a=hash(c[i].name1);
				//	System.out.println(c[i].name1);
				//	System.out.println("Value of a is "+a);
					h1[a]=c[i];
					
					
				}
				
		//	System.out.println(h1[106].name1);
				BufferedReader br1;
				FileReader fr1;
				fr1=new FileReader("queryinput7.txt");
				br1=new BufferedReader(fr1);
				int x;
				x=Integer.parseInt(br1.readLine());
				int type;//0-default(non-sorted array , no choice) 1-non-sorted array 2-sorted array 3-hash implementation
				String s4,s3=null;
				while(x>0)
				{
					type=2;
					s4=br1.readLine();
					if(type==0 || type==1)
					{
						for(i=0;i<nc;i++)
						{
							if(s4.compareTo(c[i].name1)==0)
							{
								s3=c[i].name2;
								
							}
						}
						
						if(s3==null)
						{
							s3="no girlfriend for this boy";
						}
					
					
					}
					
					else if(type==2)
					{
						int l=0;
						int u=nc-1;
					//	System.out.println(u);
						int d;
					//	System.out.println("S4 is "+s4);
					//	d=binarysearch(s4,c1,l,u);
					
						for(d=0;d<nc;d++)
						{
							//System.out.println(c1[d].name1);
							if(s4.compareTo(c1[d].name1)==0)
							{
								s3=c1[d].name2;
							}
						}
					if(s3==null)
					{
						s3="no girlfriend";
					}
					
					}
					else
					{
						int p=hash(s4);
						s3=h1[p].name2;
						if(s3==null){
							s3="no girlfriend for this boy";
						}
					}
					
					
				x--;
			//	System.out.println(s3);

				bw5.write(s3);
				bw5.newLine();
			
				
				
				
				
				s3=null;}
			
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				bw5.close();
			
				br.close();
				br1.close();
				
			
			
			
			
			
			
			
			
			
			
			
			
	
	
	}
	
	

	
	}








