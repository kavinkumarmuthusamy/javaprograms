package newp;
import java.util.*;
public class withoutloopincrease {
 
    public static void main(String[] args) {
    	Scanner d=new Scanner(System.in);
        int a=0;
       int s=d.nextInt();
        rec(a,s);
    }
    public static void rec(int a,int s){
        if(a<=s){
            System.out.println(a);
            a++;
            rec(a,s);
        }
    }
}
