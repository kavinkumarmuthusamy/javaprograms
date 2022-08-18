package newp;
import java.util.*;
public class countsinglechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner in=new Scanner(System.in);
         System.out.println("enter the string");
         String a=in.nextLine();
         char arr[]=a.toCharArray();
         int b=1;
         for(int i=0;i<arr.length;i++) {
        	 b=1;
             for(int j=0;j<arr.length;j++) {
            	 if(arr[i]==arr[j]&&i!=j) {
            		 b++;
            		 arr[j]=0;
            	 }
             }
             if(arr[i]!=0) {
            	 System.out.println(arr[i]+"  count the value  "+b);
             }
         }
	}

}
