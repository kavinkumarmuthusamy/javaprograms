package newpack;
import java.util.*;
public class sumsmall {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
        int n=in.nextInt();
        System.out.println("enter the array valu");
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=in.nextInt();
        }
        int a=999;
        int c=0;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		c=arr[i]+arr[j];
        		if(c>-1&&c<a) {
        			int res=0;
        			for(int k=0;k<n;k++) {
        				if(c==arr[k]) {
        					res=1;
        					break;
        				}
        			}
        			if(res==0) {
        			a=c;}
        		}
        	}
        }
        System.out.println(a);
	}

}
