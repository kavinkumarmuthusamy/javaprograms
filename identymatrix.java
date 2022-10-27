package newp;
import java.util.*;
public class identymatrix {

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
        int res=0;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		if(i==j&&arr[i][j]!=1) {
        			res=1;
        			break;
        		}
        		if(i!=j&&arr[i][j]!=0) {
        			res=1;
        			break;
        		}
        	}
        } 
        if(res!=0) {
        	System.out.println("it is not identy matrix");
        }
        else {
        System.out.println("it is identy matrix");
        }
	}

}
