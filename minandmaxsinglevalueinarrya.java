//min and max single valuein arrya
import java.util.Scanner;

public class minandmaxsinglevalueinarrya {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
   	 	System.out.println("enter the arrya size ");

		int n=in.nextInt();
		System.out.println("enter the arrya value");
        int [] arr=new int[n];
         for (int i=0;i<n;i++) {
        	 arr[i]=in.nextInt();
         }
         
         int m,r,b=0,max=0,min=10;
         for( int i=0;i<n;i++) { 
        	 m=arr[i];
        	 while(m!=0){
        		 r=m%10;
        	 if(max<r) {
        		 max=r;}
        	 if(min>r) {
        		 min=r;
        	 }
        	 m=m/10;
        	 }
         }
        	 System.out.println("max"+max+"min"+min);
	}
}