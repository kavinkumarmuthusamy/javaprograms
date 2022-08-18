//sum and print the matrix
import java.util.Scanner;
public class pro33 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
   	 	System.out.println("enter the arrya row  "+"coloum");

		int n=in.nextInt();
		int m=in.nextInt();
		System.out.println("enter the arrya value of a");
		int [][] a=new int[n][m];
         for (int i=0;i<n;i++) {
        	 for(int j=0;j<m;j++) {
        	 a[i][j]=in.nextInt();
         }		}
         System.out.println("arrya a");
         for (int i=0;i<n;i++) {
        	 for(int j=0;j<m;j++) {
        	 System.out.print(a[i][j]+" ");
         }	System.out.println();	
        	 }
         System.out.println("enter the arrya value of b");
 		int [][] b=new int[n][m];
 		int [][] c=new int[n][m];
          for (int i=0;i<n;i++) {
         	 for(int j=0;j<m;j++) {
         	 b[i][j]=in.nextInt();
          }		}
          System.out.println("arrya b");
          for (int i=0;i<n;i++) {
         	 for(int j=0;j<m;j++) {
         	 System.out.print(b[i][j]+" ");
          }	System.out.println();	
         	 }
          for (int i=0;i<n;i++) {
          	 for(int j=0;j<m;j++) {
          	 c[i][j]=a[i][j]+b[i][j];
          	 } }
          System.out.println("sum");
          for (int i=0;i<n;i++) {
          	 for(int j=0;j<m;j++) {
          		 System.out.print(c[i][j]+" ");
          	 }
          	 System.out.println();}
	}

}
