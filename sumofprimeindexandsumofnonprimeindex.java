// sum of prime index and sum of non prime index
import java.util.Scanner;

public class sumofprimeindexandsumofnonprimeindex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
   	 	System.out.println("enter the arrya size ");

		int n=in.nextInt();
		System.out.println("enter the arrya value");
		int [] arr=new int[n];
         for (int i=0;i<n;i++) {
        	 arr[i]=in.nextInt();
         }		
		int res=0;
		int i,c=0,d=0;
		for(i=0;i<n;i++) {
			if(i==0||i==1) {
				continue;
			}
			
        	 for(int j=2;j<=i/2;j++) {
        		 res=0;
        		 	if(i%j==0){
        		 		res=1;
        		 		break;
        		 	}}
        		 	if(res==0) {
        		         c=c+arr[i];
        		 	}
        		 	else{
        		 		d=d+arr[i];
        		 	}
		}
		System.out.println(" sum of prime index"+c+"sum of non prime index"+d);
         }
	}


