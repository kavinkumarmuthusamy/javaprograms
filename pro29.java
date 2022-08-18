//asscending and non rebtaied
import java.util.Scanner;
public class pro29 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
   	 	System.out.println("enter the arrya size ");

		int n=in.nextInt();
		System.out.println("enter the arrya value");
        int [] arr=new int[100];
        
         for (int i=0;i<n;i++) {
        	 arr[i]=in.nextInt();
         }
         
         int max=0;
         for( int i=0;i<n;i++) {
        	 for(int j=i+1;j<n;j++) {
        	 if(arr[i]>arr[j]) {
        		 max=arr[i];
                 arr[i]=arr[j];
                 arr[j]=max;
        	 }
        	 }
         }
System.out.println();
System.out.println("ascending order");
for(int  i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
}


System.out.println();
for(int i=0;i<=n;i++) {
		if(arr[i]==arr[i+1]) {
			continue;
		}
		else {
			System.out.print(arr[i]+" ");
		}
}
	}

}
