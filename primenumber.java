package newpack;
import java.util.*;
public class primenumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of arrya");
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the arrya number "+(i+1));
			a[i]=in.nextInt();
		}
		int res=0;
       for(int i=0;i<n;i++) {
    	   for(int j=2;j<=a[i]/2;j++) {
    		   res=0;
    		   if(a[i]%j==0) {
    			   res=1;
    			   break;
    		   }
    	   }
    	   if(res==1) {
    		   System.out.println("arrya "+(i+1)+" is not prime "+a[i]);
    	   }
    	   if(res==0) {
    		   System.out.println("arrya "+(i+1)+" is prime "+a[i]);
    	   }
    	   }
	}

}
