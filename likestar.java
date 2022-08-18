package newp;
import java.util.*;
public class likestar {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);	
       System.out.println("enter the word");
       String a=in.nextLine();
       char arr[]=a.toCharArray();
       int b=0;
       int c=arr.length;
       for(int i=1;i<=arr.length/2;i++) {
    	   int d=0;
    	   for(int j=1;j<=i;j++) {
    		   System.out.print(arr[b]);
    		   b=b+1;
    		  d=j;
    	   }
    	   System.out.println();
    	   c=c-d;
    	   if(c<d+1) {
    		   break;
    	   }
       }
	}

}
