
public class Test {
	int i;
	void setvalue(int i)
	{
		this.i=i;
		//i=x;
	}
	void show ()
	{
		System.out.println(i);
	}
}
class Testfinal
{
	public static void main (String [] args)
	{
		Test t=new Test();
	t.setvalue(17);
	t.show();
	}
}

