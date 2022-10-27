package newpack;
import java.util.*;
public class shufflearrya {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of arrya");
		int n=in.nextInt();
		System.out.println("enter the arrya");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
//		int b=0;
//		for(int i=0;i<n;i++) {
//			b=arr[i]+n;
//			b=b%10;
//			while(b>n-1||b<0) {
//				if(b>n-1) {
//					b=b/2;
//				}
//				if(0>b) {
//					
//					b=-1*b;
//				}
//				
//			}
//			int c=arr[i];
//			arr[i]=arr[b];
//			arr[b]=c;
//		}
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i]+"");
//		}
Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			int randomIndexToSwap = rand.nextInt(arr.length);
			int temp = arr[randomIndexToSwap];
			arr[randomIndexToSwap] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
