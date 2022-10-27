package newp;
import java.util.*;
public class missingnumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the numer");
		String a=in.nextLine();
		System.out.println("enter the times");
		int n=in.nextInt();
		String arr[]=a.split(" ");
		int brr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			 brr[i]=Integer.parseInt(arr[i]);
		}
		int b=brr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(brr[i]>brr[j]&&i!=j) {
					int c=brr[i];
					brr[i]=brr[j];
					brr[j]=c;
				}
			}
		}
		int res=0;
		int d=brr[1]-brr[0];
		int e=brr[2]-brr[1];
		if(e!=d) {
			d=brr[1]/brr[0];
		    e=brr[2]/brr[1];
		    res=1;
		}
		for(int i=0;i<arr.length;i++) {
			if(brr[i]!=b) {
				System.out.println(b);
				i=i-1;
			}
			if(res==0) {
				b=b+d;
			}
			if(res==1) {
				b*=d;
			}
		}
	}
}
