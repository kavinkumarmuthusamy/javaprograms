package diva;
import java.util.*;
public class longestsubstring {
	int d=0;
	public longestsubstring(int e,int f,char arr[]){
		d=0;
		for(int i=e;i<f-1;i++) {
			int c=1;
			for(int j=i+1;j<f;j++) {
				if(arr[i]==arr[j]) {
					d=0;
					break;
				}
				c++;
				if(d<c) {
					d=c;
				}
			}
		}
//		System.out.println(d);
	}

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		System.out.println("Enter the string");
		String a=in.nextLine();
		char arr[]=a.toCharArray();
		int c=0,z=0;
		int e=0,f=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]||j==arr.length) {
					e=i;
					f=j;
					longestsubstring  obj=new longestsubstring(e,f,arr);
					if(z<obj.d) {
						z=obj.d;
					}
				}
				
			}
		}
		System.out.println(z);
	
	}
}
