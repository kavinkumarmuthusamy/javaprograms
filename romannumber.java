package diva;
import java.util.*;
public class romannumber {

	public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int a=10000;
         while(a>3999) {
        	 System.out.println("please enter the number below 10000");
         a=in.nextInt();}
         int b=a;
         String z="";
         int d=1000;
         int c=0;
         while(d>0) {
           c=b/d;
        	 c=c%10;
        	 String e = "";
        	 String f = "";
        	 String g = "";
        	   if(d==1000) {
        		   e="";
                   f="M";
        	   }
        	   if(d==100) {
        		   e="D";
                   f="C";
                   g="M";
        	   }
        	   if(d==10) {
        		   e="L";
                   f="X";
                   g="C";
        	   }
        	   if(d==1) {
        		   e="V";
                   f="I";
                   g="X";
        	   }
        	   switch(c) {
  			 case 1:
  				 z+=f;
  				 break;
  			 case 2:
  				 z+=f+f;
  				 break;
  			 case 3:
  				 z+=f+f+f;
  				 break;
  			 case 4:
  				 z+=f+e;
  				 break;
  			 case 5:
  				 z+=e;
  				 break;
  			 case 6:
  				 z+=e+f;
  				 break;
  			 case 7:
  				 z+=e+f+f;
  				 break;
  			case 8:
 				 z+=e+f+f+f;
 				 break;
  			case 9:
 				 z+=f+g;
 				 break;
        	   }
        	d=d/10; 
         }
     System.out.println(z);
        	 
	}

}
