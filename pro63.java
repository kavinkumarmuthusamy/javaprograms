//gompare two string
import java.util.*;
public class pro63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       System.out.println("enter the arrya size");
       int n=in.nextInt();
       int a[]=new int[n];    
       System.out.println("enter the arrya a");
       for(int i=0;i<n;i++) {
    	   a[i]=in.nextInt();
       }
       System.out.println("enter the arrya size");
       int m=in.nextInt();
       int b[]=new int[m];    
       System.out.println("enter the arrya b");
       for(int i=0;i<m;i++) {
    	   b[i]=in.nextInt();
       }
       int res=1;
       for(int i=0;i<m;i++) {
    	   for(int j=0;j<n;j++) {
    		   if(a[j]==b[i]) {
    			   res++;
    			   break;
    		   }
    	   }
    	   }
    	   if(res==m+1) {
    		   System.out.println("yes");
    	   }else {
    		   System.out.println("no");
    		  
    	   }
       
	}

}
