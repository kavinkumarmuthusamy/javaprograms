package newp;
import java.util.*;
class timesame{
	 static int d=0;
	public static int sec1(int s1,int m2,int s2) {
		if(s2>=s1) {
			s2=s2-s1;
		}
		else {
			m2=m2-1;
			s2=s2+60;
			s2=s2-s1;
		}
		d=m2;
		return s2;
	}
	public static int min1(int m1,int h2,int m2) {
		m2=d;
		if(m2>=m1) {
			m2=m2-m1;
		}
		else {
			h2=h2-1;
			m2=m2+60;
			m2=m2-m1;
		}
		d=h2;
		return m2;
	}
	public static int hor6(int h1,int h2) {
		h2=d;	
		h2=h2-h1;
		return h2;
	}
}
public class classtime {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the start time");
        int h1=in.nextInt();
        int m1=in.nextInt();
        int s1=in.nextInt();
        System.out.println("enter the stop time");
        int h2=in.nextInt();
        int m2=in.nextInt();
        int s2=in.nextInt();
        int c=timesame.sec1(s1,m2,s2);
       int f=timesame.min1(m1,h2,m2);
     int e=timesame.hor6(h1,h2);
     if(e>=0&&c>=0&&f>=0) {
     System.out.println("no of time "+e+" min "+f+" sec "+c);}
     else {
    	 System.out.println("enter time is wrong");
     }
	}

}
