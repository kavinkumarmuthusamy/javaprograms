package diva;
import java.util.*;
public class train {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size of arrival");
	int n=in.nextInt();
	double arr[]=new double[n];
	double brr[]=new double[n];
	for(int i=0;i<n;i++) {
		arr[i]=in.nextDouble();
	}
	for(int i=0;i<n;i++) {
		brr[i]=in.nextDouble();
	}
	double crr[]=new double[n+n];
	for(int i=0,j=0;i<n+n;i=i+2,j++) {
		crr[i]=arr[j];
		crr[i+1]=brr[j];
	}
	for(int i=0;i<(n+n-1);i++) {
		for(int j=i+1;j<n+n;j++) {
			if(crr[i]>crr[j]) {
				double z=crr[i];
				crr[i]=crr[j];
				crr[j]=z;
				
			}
		}
	}
	int d=0;
	int e=0;
	for(int i=0;i<n+n;i++) {
		for(int j=0;j<n;j++) {
			if(crr[i]==arr[j]) {
				d+=1;
			}
			if(crr[i]==brr[j]) {
				d-=1;
			}
		}
		if(e<d) {
			e=d;
		}
	}
	System.out.println(e);
	}

}
