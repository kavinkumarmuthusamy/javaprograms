import java.util.*;
public class swapingarryavalues {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        for(;;) {
        System.out.println("enter the size in even number");
        int n=in.nextInt();
        if(n%2==0) {
        int arr[]=new int[n];
        System.out.println("enter the number in array");
        for(int i=0;i<n;i++) {
        	arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i=i+2) {
        	arr[i]=arr[i]+arr[i+1];
        	arr[i+1]=arr[i]-arr[i+1];
        	arr[i]=arr[i]-arr[i+1];
        }
        System.out.println("after swaping");
        for(int i=0;i<n;i++) {
        	System.out.println(arr[i]);
        }
      break; }
	}
  }
}
