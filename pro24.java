//age program
import java.util.Scanner;

public class pro24 {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
	     System.out.println("enter the date:");
	     int d1=in.nextInt();
	     System.out.println("enter the month:");
	     int m1=in.nextInt();
	     System.out.println("enter the year:");
	     int y1=in.nextInt();
	     int d2=15,m2=07,y2=2022,d3,m3,d,m,y,y3;
	      if(d1>d2) {
	    	  d2=d2+30;
	    	  m2=m2-1;
	    	  d=d2-d1;
	      }else {
	    	  d=d2-d1;
	      } if(m1>m2) {
	    	  m2=m2+12;
	    	  y2=y2-1;
	    	  m=m2-m1;
	      }else {
	    	  m=m2-m1;
	      } 
	    	  y=y2-y1;
	       System.out.println(" age_ date:"+d+"  month:"+m+"  year:"+y);
	      
	      d3=d+(m*30);
	      y3=365-d3;
	System.out.println("To go birth day:"+y3);
			}

}
