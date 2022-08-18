// anagram or not
import java.util.*;
public class pro42 {

	public static void main(String[] args) {
                 Scanner in=new Scanner(System.in);
                 System.out.println("enter the first string:");
                 String a=in.nextLine();
                 char[] arr1 = a.toCharArray();
                 System.out.println("enter the second string:");
                 String b=in.nextLine();
                 char[] arr2 =b.toCharArray();
                 Arrays.sort(arr1);
                 Arrays.sort(arr2);
//                 System.out.println(new String(arr2));
                 if(new String(arr1).equals(new String(arr2))) {
                 System.out.println("It is anagram");
	                   }
                 else {
		System.out.println("It is not a anagram");
	                 }
                 }

}
