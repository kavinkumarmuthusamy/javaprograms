package newp;
import java.util.*;
public class secondstringrevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string 1");
        String a=in.nextLine();
        System.out.println("enter the string 2");
        String b=in.nextLine();
        String c=a;
       char brr[]=b.toCharArray();
       for(int i=brr.length-1;i>=0;i--) {
    	   c+=brr[i];
       }
       System.out.println(c);
	}

}
