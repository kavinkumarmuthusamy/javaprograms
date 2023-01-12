package diva;
import java.util.*;
public class area {
	int c;
		public area(int a,int b){
			c=a*b;
		}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
        int a=in.nextInt();
		System.out.println("Enter the breadth of rectangle");
		 int b=in.nextInt();
		 area obj=new area(a,b);
		 System.out.println(obj.c);
	}

}
