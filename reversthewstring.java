// revers thew string
import java.util.*;
public class reversthewstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter the string");
String a=in.nextLine();
String arr[]=a.split(" ");
for(int i=arr.length-1;i>=0;i--) {
	System.out.println(arr[i]);
   }
	}

}
