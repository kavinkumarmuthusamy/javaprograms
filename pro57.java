//same letter are printin full string
import java.util.*;
public class pro57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the string");
       String a=in.nextLine();
       char ar[]=a.toCharArray();
       int b=1;
       for(int i=1;i<ar.length;i++) {
    	   if(ar[0]==ar[i]) {
    		   b++;
    	   }
       }
       if(b==ar.length) {
    	   System.out.println("the given string is correct: "+a+"   yes");
       }
       else {
    	   System.out.println("No");
       }
	}

}
