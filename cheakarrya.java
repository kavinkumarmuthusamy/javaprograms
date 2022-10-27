package newpack;
import java.util.*;
public class cheakarrya {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the arrya 1 size");
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the number of arrya "+(i+1));
			a[i]=in.nextInt();
		}
        System.out.println("enter the second arrya size");
        int m=in.nextInt();
        int b[]=new int[m];
		for(int i=0;i<m;i++) {
			System.out.println("enter the number of arrya "+(i+1));
			b[i]=in.nextInt();
		}
		int res=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i]==b[j]) {
					res=1;
					break;
				}
			}
			if(res==0) {
				res=0;
				break;
			}
		}
		if(res==0) {
			System.out.println("false");
		}
		if(res==1) {
			System.out.println("true");
		}
	}

}
