package newpack;
import java.util.*;
public class magicsquare {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the nuber of row");
		int n=in.nextInt();
		System.out.println("enter the nuber of colum");
		int m=in.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=in.nextInt();
			}
		}
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i]+=arr[i][j];
			}
		}
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				b[i]+=arr[j][i];
			}
		}
		int res=0;
		for(int i=1;i<n;i++) {
			if(a[i]!=a[i-1]) {
				res=1;
				break;
			}
			if(b[i]!=b[i-1]) {
				res=1;
				break;
			}
		}
		if(res==1) {
			System.out.println("False");}
		if(res==0) {
		System.out.println("True");	
		}
	}

}
