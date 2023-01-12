package diva;
class a
{
	private int a;
	
	public int geta()
	{
		
		return a;
	}
	public void seta(int x)
	{
		a=x*x;
	}
	public void a1()
	{
		System.out.println(a);

	}
}
public class trd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			a o=new a();
//			o.a=10;

			o.seta(20);
			o.a1();
	}

}
