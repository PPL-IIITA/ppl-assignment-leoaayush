package pplq8;

import java.io.*;
import java.io.File;
import java.io.FileWriter;

/**
 * Library Class for the 2 implementations
 * @author Aayush
 *
 */
public class Libclass  {

	  
int type=0;
/**
 * Default Implementation
 */
void simpleimplementation()
{
	 commited[] c =new commited[5];
		
		for(int i1=0;i1<5;i1++)
		{
			c[i1]=new commited();
		}
		
	int cost =0,z=-1,l;
	
	String name="aa";
	for(int i=0;i<5;i++)
	{   
		cost=0;
		z=-1;
		for(l=0;l<5;l++)
		{
			if(name==null)
				break;
		}
		
		
	
		if(z==1)
		{
			while(cost<=0)
			{
						
					z++;
			
			}
			c[i].battr=cost;
			c[i].bhap=c[i].bud-cost;
		}
		
		if(c[i].btype==2)
		{
			while(cost<=c[i].bud)
			{
				if(c[++z].battr==0){
				cost=cost+c[z].battr;
				if(c[z].bintl==2)
				{
					c[i].luxtotal=c[i].luxtotal+cost;
				}
					
				
				
				}
				else
					z++;
			}
			
		}
		
		if(c[i].btype==3)
		{
			while(cost<=c[i].maintg)
			{
				if(c[++z].cflag==0){
				cost=cost+c[z].bud;
				if(c[z].bintl==2)
				{
					c[i].luxtotal=c[i].luxtotal+cost;
				}
					
				}
				else
					z++;
			}
			while(c[z].bhap!=2) {
				z++;
			}
			if((c[i].bud-cost)>=c[z].btype)
			{
				
			}	
			
	
		}

}


}
/**
 * Special Implementation
 */
void secondimplementation()
{
	int a,b;
	
	 gifts [] f =new gifts[5];
		
		for(int i1=0;i1<5;i1++)
		{
			f[i1]=new gifts();
		}



		for(int i=0;i<5;i++)
		{
			
			
			for(int k1=0;k1<5;k1++)
			{
					if(f[k1].gifttype==1 && f[k1].status==0){
											f[k1].status=1;
						break;
					}
			}

			for(int k1=0;k1<5;k1++){
				
							if(f[k1].gifttype==2 && f[k1].status==0){
				
								f[k1].status=1;
									break;
								}
				}


			for(int k1=0;k1<5;k1++){
				
				
							if(f[k1].gifttype==3 && f[k1].status==0){
				
				
									f[k1].status=1;
									break;
								}
				}



	}






}







}













