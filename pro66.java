//0 or 1 revers or fornt print
import java.util.*;
public class pro66 {

	public static void main(String[] args) {
           Scanner in=new Scanner(System.in);
           System.out.println("enter the string");
           String a=in.nextLine();
           String arr[]=a.split(" ");
           System.out.println("enter 0 or 1 only:");
           int b=in.nextInt();
           if(b==1) {
        	   for(int i=0;i<arr.length;i++) {
        		   System.out.print(arr[i]+" ");
        	   }
           }else {
        	   for(int i=arr.length-1;i>=0;i--) {
        		   System.out.print(arr[i]+" ");
        	   }
           }
	}

}
