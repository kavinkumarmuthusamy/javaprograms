package newpack;
import java.util.*;
public class calc {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the question");
		String s=in.nextLine();
		char arr[]=s.toCharArray();
		int brr[]=new int[100];
		int n=0;
		int b=0;
		String c="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='+'||arr[i]=='/'||arr[i]=='*'||arr[i]=='-') {
				b=b/10;
				brr[n]=b;
				n++;
				b=0;
				c+=arr[i];
			}
			else {
				b+=arr[i]-48;
				b=b*10;
			}
		}
		b=b/10;
		brr[n]=b;
		int z=0;
		char crr[]=c.toCharArray();
		for(int i=n-1;i>=0;i--) {
			if(crr[i]=='/') {
				z=brr[i]/brr[i+1];
				brr[i]=z;
				brr[i+1]=0;
			}
		}
		for(int i=0;i<n;i++) {
			if(crr[i]=='*') {
				if(brr[i+1]==0) {
					for(int j=i;j<n;j++) {
						z=brr[i]*brr[j];
						brr[i]=z;
						brr[j]=0;
					}
				}else {
				z=brr[i]*brr[i+1];
				brr[i]=z;
				brr[i+1]=0;}
			}
		}
		for(int i=0;i<n;i++) {
			if(crr[i]=='+') {
				if(brr[i+1]==0) {
					for(int j=i;j<n;j++) {
						z=brr[i]+brr[j];
						brr[i]=z;
						brr[j]=0;
					}
				}else {
				z=brr[i]+brr[i+1];
				brr[i]=z;
				brr[i+1]=0;}
			}
		}
		for(int i=0;i<n;i++) {
			if(crr[i]=='*') {
				if(brr[i+1]==0) {
					for(int j=i;j<n;j++) {
						z=brr[i]-brr[j];
						brr[i]=z;
						brr[j]=0;
					}
				}else {
				z=brr[i]-brr[i+1];
				brr[i]=z;
				brr[i+1]=0;}
			}
		}
		for(int i=0;i<n;i++) {
			if(brr[i]>0) {
				z=brr[i];
			}
		}
		System.out.println(z);
		int res=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[0]<=47||(arr[i]<=47&&arr[i+1]<=47)||arr[arr.length-1]<=47) {
			res=1;
			break;}
		}
		if(res==0) {
			System.out.println("valid string");
		}
		else {
			System.out.println("invalid string");
		}
	}
}
