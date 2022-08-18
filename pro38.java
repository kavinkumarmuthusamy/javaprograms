//upper and lower triangler
import java.util.Scanner;
public class pro38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
   	 	System.out.println("enter the arrya a row  "+"coloum");

		int n=in.nextInt();
		int m=in.nextInt();
		System.out.println("enter the arrya value of a");
		int [][] a=new int[n][m];
         for (int i=0;i<n;i++) {
        	 for(int j=0;j<m;j++) {
        	 a[i][j]=in.nextInt();
         }		
        }
         System.out.println("lower triangle "+" upper triangle");
         if(m!=n) {
        	 System.out.println("not a matrix");
         }
         else { 
        	 for(int i = 0; i < n; i++){    
                 for(int j = 0; j < m; j++){    
                   if(i > j)    
                     System.out.print("0 ");    
                   else    
                     System.out.print(a[i][j] + " ");    
                 }    
                 System.out.println();    
             }    
        	 for(int i = 0; i < n; i++){    
                 for(int j = 0; j < m; j++){    
                   if(i < j)    
                     System.out.print("0 ");    
                   else    
                     System.out.print(a[i][j] + " ");    
                 }    
                 System.out.println();    
             }    
         } 
         
	}

}
