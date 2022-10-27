package newp;
import java.util.*;
public class matrixstar {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the row size");
        int n=in.nextInt();
        System.out.println("enter the colum size");
        int m=in.nextInt();
        System.out.println("enter the values");
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		arr[i][j]=in.nextInt();
        	}
        }
       char b='*';
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		if(i==j) {
        			System.out.print(b+" ");
        		}
        		else {
        			System.out.print(arr[i][j]+" ");
        		}
        	}
        	System.out.println();
        }
	}

}
