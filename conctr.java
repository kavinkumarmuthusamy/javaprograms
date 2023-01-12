package diva;

public class conctr {
	int b;
	int f,d;
	
	public conctr(int y,  int g) {
  d=y+g;
	}
	public static void main(String[] args) {
		conctr obj = new conctr(10,67);
		System.out.println(obj.d);
	}

}
