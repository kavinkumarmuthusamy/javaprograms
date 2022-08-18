package newp;
import java.util.*;
 class abc{
	 void real(float a1,float a2,float b1,float b2) {
		float sum1,sum2;
		sum1=a1+a2;
		sum2=b1+b2;
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
public class addtocomplexnumber {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the image number 1");
    float a1=in.nextFloat();
    System.out.println("enter the real number 1");
    float b1=in.nextFloat();
    System.out.println("enter the image number 2");
    float a2=in.nextFloat();
    System.out.println("enter the real number 2");
    float b2=in.nextFloat();
    abc obj=new abc();
    obj.real(a1, a2, b1, b2);
	}

}
