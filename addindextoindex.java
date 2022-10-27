package newp;
import java.util.*;
public class addindextoindex {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String a=in.nextLine();
        String arr[]=a.split(" ");
        System.out.println("enter the index number start and end");
        String b=in.nextLine();
        String brr[]=b.split(" ");
       int c=Integer.parseInt(brr[0]);
       int d=Integer.parseInt(brr[1]);
        int crr=0;
        for(int i=c;i<d;i++) {
        	 crr+=Integer.parseInt(arr[i]); 
        }
       System.out.println(crr);
	}

}
