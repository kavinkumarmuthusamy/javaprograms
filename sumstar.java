package newp;
import java.util.*;
public class sumstar {

	public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("enter the size of the string");
         int n=in.nextInt();
         int arr[][]=new int[n][n];
         int brr[][]=new int[n][n];
         System.out.println("enter the first string");
         for(int i=0;i<n;i++) {
        	 int a=0;
        	 for(int j=n;j>i;j--) {
            	 System.out.print("enter the "+(i+1)+" row "+(a+1)+" colum");
            	 arr[i][a]=in.nextInt();
        		 a++;
        	 }
         }
         System.out.println("enter the second string");
         for(int i=0;i<n;i++) {
        	 int a=0;
        	 for(int j=n;j>i;j--) {
            	 System.out.print("enter the "+(i+1)+" row "+(a+1)+" colum");
            	 brr[i][a]=in.nextInt();
            	 arr[i][a]+=brr[i][a];
        		 a++;
        	 }
         }
         for(int i=0;i<n;i++) {
        	 int a=0;
        	 for(int j=n;j>i;j--) {
            	System.out.print(arr[i][a]+"  ");
        		 a++;
        	 }
        	 System.out.println();
         }
	}

}
