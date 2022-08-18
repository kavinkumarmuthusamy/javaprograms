//no of repated word
import java.util.*;
public class pro59 {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner in=new Scanner(System.in);
            System.out.println("ehter the string");
            String a=in.nextLine();
            String arr[]=a.split(" ");
            System.out.println("enter the number of string:");
            int n=in.nextInt();
            String b[]=new String[n+1];
            for(int i=0;i<=n;i++) {
            	b[i]=in.nextLine();
            }
            int c=0,d=1;
            for(int i=0;i<arr.length;i++) {
            	d=1;
            	for(int j=0;j<=n;j++) {
            		if(arr[i].equals(b[j])) {
//            			System.out.println("same word: "+arr[i]);
                    c++;d++;
                    System.out.println(d);
            		}
            		
            	}
            	if(d>1)
        		{
        			System.out.println(arr[i]);
        		}
            }
            System.out.println("no of words"+c);
	}

}
