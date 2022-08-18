import java.util.*; 
public class pro64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner in=new Scanner(System.in);
          System.out.println("enter the number of cars");
          int n=in.nextInt();
          System.out.println("enter the number of cars");
          int m=in.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++) {
          System.out.println(i+1+" enter car number");
          a[i]=in.nextInt();
          }
          int b=0;
          if(m%2==0) {
               for(int i=0;i<n;i++) {
        	       if(a[i]%2!=0) {
        			  b=b+250;
                      System.out.print(a[i]+"&#39,");
        		  }else {
                      System.out.print("&#39,");
        		  }
        	  }
               System.out.println("fine number mention each car is 250");
               System.out.println("total fine amount: "+b);
          }
          else {
        	  for(int i=0;i<n;i++) {
       	       if(a[i]%2==0) {
       			  b=b+250;
                     System.out.print(a[i]+"&#39,");
       		  }else {
                     System.out.print("&#39,");
       		  }
       	  }
              System.out.println("fine number mention each car is 250");
              System.out.println("total fine amount: "+b);
          }
	}

}
