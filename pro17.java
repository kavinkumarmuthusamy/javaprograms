//add the vavue in specide space and also removed
import java.util.Scanner;

public class pro17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
   	 	System.out.println("enter the arrya size ");

		int n=in.nextInt();
		int i;
        int [] arr=new int[000];
         for (i=0;i<n;i++) {
        	 arr[i]=in.nextInt();
         }
         for(i=0;i<n;i++) {
        	 System.out.println("given arrya"+arr[i]);
         }
    	 System.out.println("enter the index value :");

 		int m=in.nextInt();
 		System.out.println("enter the element :");
 		int a=in.nextInt();
for( i=n;i>m-1;i--) {
	arr[i+1]=arr[i];
}
	arr[m]=a;
			n++;
			for(i=0;i<n;i++) {
	System.out.println("added the value;"+arr[i]);
	}
			int b=in.nextInt();	
for(i=b;i>n;i++) {
	arr[i]=arr[i+i];
}
n--;
for(i=0;i<n;i++) {
	System.out.println("remove the value;"+arr[i]);
	}
	}
}
