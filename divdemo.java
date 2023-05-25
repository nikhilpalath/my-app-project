class Div
{
	int a,b,c;
	void accept()
	{
	a=40;
	b=20;
	}
	void division()
	{
		c=a/b;
	}
	void show()
	{
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
		System.out.println("division="+c);
	}
}
class DivDemo
{
	public static void main(String[] args) 
	{
		Div d=new Div();
		d.accept();
		d.division();
		d.show();
	}
}
