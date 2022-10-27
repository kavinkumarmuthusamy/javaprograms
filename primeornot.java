//prime or not//
import java.util.Scanner;
public class primeornot {

	public static void main(String[] args) {
		   Scanner in = new Scanner(System.in);
		   System.out.println("enter the value");
   	       int val=in.nextInt();
		   int res=0;
	       System.out.println("0 it is not prime");
    	   System.out.println("1 it is not prime");
		   for(int j=2;j<=val;j++) {
			  for(int i=2;i<=j/2;i++){
			                 res=0;
			    	if(j%i==0){
			                res=1;
			                break;
			               }
			   }
			   if(res!=0){
			             System.out.println(j+"it is not prime");
			            }
			   else{
		        	    System.out.println(j+"it is prime");
			    
			       }
	    }
	}
}