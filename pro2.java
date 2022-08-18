package newp;
import java.util.*;
public class pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner in=new Scanner(System.in);
          System.out.println("enter the string");
           String a=in.nextLine();
           char arr[]=a.toCharArray();
           for(int i=0;i<arr.length;i++) {
        	   char ch=arr[i];
        	   int b=ch;
        	   int res=0;
        	   System.out.println("charter "+arr[i]+"ascii "+b);
             for(int j=2;j<=b/2;j++) {
            	 if(b%j==0) {
            		 res=1;
            	 }
             }
             if(res==0) {
            	 System.out.println(arr[i]);
             }
           }
	}

}
