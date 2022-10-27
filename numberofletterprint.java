//number of letter print
import java.util.*;
public class numberofletterprint {

	public static void main(String[] args) {
           Scanner in=new Scanner(System.in);
           System.out.println("enter the string:");
           String a=in.nextLine();
           char arr[]=a.toCharArray();
           System.out.println("enter the number:");
           int n=in.nextInt();
        	   for(int i=0;i<arr.length;i=i+n) {
        		   for(int j=i;j<i+n;j++) {
        			   System.out.print(arr[j]);
        		   }System.out.println();
        		  
        	   }
    
           }
	}


