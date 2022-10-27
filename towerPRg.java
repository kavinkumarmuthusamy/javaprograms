package newp;

public class towerPRg {
public static void main(String[] args) {
	int a[]= {1,5,8,10};
	int key=2;
	for (int i = 0; i < a.length; i++) {
		if(a[i]<key){
			a[i]=a[i]+key;
		}
		else if(a[i]>key){
			a[i]=a[i]-key;
		}
	}
	int max=a[0];
	int min=a[1];
	for (int i : a) {
		if(i>max) {
			max=i;
		}
		if(i<min) {
			min=i;
		}
		System.out.println(i);
	}
	System.out.println("element : "+(max-min));
}
}
