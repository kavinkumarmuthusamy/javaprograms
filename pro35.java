//transport of matrix
import java.util.Scanner;
public class pro35 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
   	 	System.out.println("enter the array a row  "+"coloum");

		int n=in.nextInt();
		int m=in.nextInt();
		System.out.println("enter the array value of a");
		int [][] a=new int[n][m];
		int [][] b=new int[m][n];
         for (int i=0;i<n;i++) {
        	 for(int j=0;j<m;j++) {
        	 a[i][j]=in.nextInt();
         }		}
         for(int i=0;i<n;i++) {
        	 for(int j=0;j<m;j++) {
        		 b[j][i]=a[i][j];
        	 }
         }System.out.println("transport of a");
         for(int i=0;i<n;i++) {
        	 for(int j=0;j<m;j++) {
        		System.out.print(b[i][j]+" ");
        	 }System.out.println();
         } 
	}

}
