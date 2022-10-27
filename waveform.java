package newp;
import java.util.*;
public class waveform {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the arrya size divid 2");
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the number"+(i+1));
			arr[i]=in.nextInt();
		}
		int b=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					b=arr[i];
					arr[i]=arr[j];
					arr[j]=b;
				}
			}
			
		}
		for(int i=0;i<n;i=i+2) {
			b=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=b;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
