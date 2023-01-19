package basics.programms;

public class Gen<T> {
	T ob;
	
	Gen(T ob)
	{
		this.ob=ob;
	}
	public void show()
	{
		System.out.println("type of object is:-"+ob.getClass().getName());
	}
	public T getob()
	{
		return ob;
	}

}
