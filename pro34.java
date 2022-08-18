//multiple of two matrix
import java.util.Scanner;
public class pro34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
   	 	System.out.println("enter the arrya a row  "+"coloum");

		int n=in.nextInt();
		int m=in.nextInt();
		System.out.println("enter the arrya value of a");
		int [][] a=new int[n][m];
         for (int i=0;i<n;i++) {
        	 for(int j=0;j<m;j++) {
        	 a[i][j]=in.nextInt();
         }		}
     	System.out.println("enter the arrya b row  "+"coloum");
     	int o=in.nextInt();
		int p=in.nextInt();
 		System.out.println("enter the arrya value of b");
 		int [][] b=new int[o][p];
 		int [][] c=new int[n][p];
          for (int k=0;k<o;k++) {
         	 for(int l=0;l<p;l++) {
         	 b[k][l]=in.nextInt();
          }		}int sum=0;
          if(m==o) {
        	  for(int i=0;i<n;i++) {
        		  for(int j=0;j<p;j++) {
        			  sum=0;
    				  for(int k=0;k<m;k++) { 
        		     sum+=a[i][k]*b[k][j];    
        		       }c[i][j]=sum;
    				  }
        		  }
        	  for(int i=0;i<n;i++) {
        		  for(int j=0;j<p;j++) {
        			  System.out.print(j+"\t");
        		  }System.out.println();
        		  }
	}
          else {
        	  System.out.println("it can not run");
          }
	}
}
