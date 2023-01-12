package diva;
import java.util.*;
public class students {
     int roll_no;String name;
	public students() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the roll_no");
		roll_no=in.nextInt();
		in.nextLine();
		System.out.println("Enter the name");
		name=in.nextLine();
	}
	public static void main(String[] args) {
		students obj=new students();
		System.out.println("roll_no = "+obj.roll_no);
		System.out.println("name = "+obj.name);

	}

}
