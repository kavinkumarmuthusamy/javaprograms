package newp;
import java.util.*;
public class matrix2d {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the row size of matrix");
        int n=in.nextInt();
        System.out.println("enter the colum size of matrix");
        int m=in.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		System.out.println("enter the "+(i+1)+" row and "+(j+1)+" colum");
        		arr[i][j]=in.nextInt();
        	}
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		System.out.print(arr[i][j]+"  ");
        	}
        	System.out.println();
        }
        System.out.println("after");
        	for(int j=m-1;j>=0;j--) {
        		for(int i=0;i<n;i++) {
        		System.out.print(arr[i][j]+"  ");
        	}
        	System.out.println();
        }
	}

}
