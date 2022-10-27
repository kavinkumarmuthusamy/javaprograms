//sumof the numbers
import java.util.*;
public class sumofthenumbers {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string:");
        String a=in.nextLine();
        char arr[]=a.toCharArray();
        int c=0;
        for(int i=0;i<arr.length;i++) {
          int h=arr[i];
        if(h<=57&&h>=48) {
//        	System.out.println(arr[i]);
//        	 System.out.println(c);
       
        	 c+=arr[i];
        }
        }
        System.out.println("sum of values: "+c);
	}

}
