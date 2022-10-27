import java.util.*;
public class starpreatenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner in=new Scanner(System.in);
           System.out.println("enter the string");
           String a=in.nextLine();
           char arr[]=a.toCharArray();
           for(int i=0;i<arr.length;i++) {
        	   for(int j=0;j<=i;j++) {
        		   System.out.print(arr[j]);
        	   }
        	   System.out.println();
           }
           
	}

}
