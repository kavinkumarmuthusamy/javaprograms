package newp;
import java.util.*;
class bc{
	public static double volume (double h,double w,double d) {
		double v=h*w*d;
		return v;
	}
}
public class volume {
	   
	    public static void main(String[] args) {
	       Scanner in=new Scanner(System.in);
	       System.out.println("enter the heigth");
	       double h=in.nextInt();
	       System.out.println("enter the width");
	       double w=in.nextInt();
	       System.out.println("enter the depth");
	       double d=in.nextInt();
	    bc obj = new bc();
	    System.out.println(obj.volume(h,w,d));

	    }
	
}
