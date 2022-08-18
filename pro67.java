//sum of the single element
import java.lang.reflect.Array;
import java.util.*;
public class pro67 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		int a=in.nextInt();
		int arr[]=new int[a];
		System.out.println("enter the number single digit 5 and doubie digit number 5");
		for(int i=0;i<a;i++) {
			arr[i]=in.nextInt();
		}
		int min=0;
		int max=0;
		for(int i=0;i<a;i++) {
			if(arr[i]<10&&arr[i]>=0) {
				min+=arr[i];
			}
			else if(arr[i]<100&&arr[i]>=10) {
				max+=arr[i];
			}
			else {
				System.out.println("it can not exit"+arr[i]);
			}
		}
		System.out.println("sum of single digit number"+min);
		System.out.println("sum of double digit number"+max);
		Arrays.sort(arr);
		int first=0;
		int last =0;
		for(int i=0;i<a/2;i++) {
                 first+=arr[i];
		}
		for(int i=a/2;i<a;i++) {
            last+=arr[i];
	}
		System.out.println("sum first half"+first);
		System.out.println("sum second half"+last); 
	}

}
