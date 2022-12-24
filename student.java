package diva;
import java.util.*;

class detail{
	Scanner in=new Scanner(System.in);
	int rollno=in.nextInt();
	String a=in.nextLine();
	String name=in.nextLine();
	String collegename=in.nextLine();
	String department=in.nextLine();
    char section=in.next().charAt(0);
    detail(){
    	System.out.println("no argument");
    }
}
public class student {
	public static void main(String[] args) {
		detail d1=new detail();
		System.out.println("roll no:"+d1.rollno);
		System.out.println("Name:"+d1.name);
		System.out.println("collage name:"+d1.collegename);
		System.out.println("department:"+d1.department);
		System.out.println("section:"+d1.section);
		
	}

}
