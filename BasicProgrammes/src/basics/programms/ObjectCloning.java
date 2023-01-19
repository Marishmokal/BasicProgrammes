package basics.programms;//PROGRAMME OF EQUALS METHOD

import java.util.Objects;

public class ObjectCloning implements Cloneable {
	int roll;
	String name;

	public ObjectCloning() {
		super();
	}

	public ObjectCloning(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;

	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectCloning other = (ObjectCloning) obj;
		return Objects.equals(name, other.name) && roll == other.roll;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
//		ObjectCloning o = new ObjectCloning(101, "vaibhavd");
//		 ObjectCloning o2= (ObjectCloning)o.clone();
		 
		 ObjectCloning o3 = new ObjectCloning(101, "vaibhavd");
		 ObjectCloning o4=new ObjectCloning(101, "vaibhavd");
		 
		

		System.out.println(o3.equals(o4));// content equality
		 System.out.println(o3==o4);//reference equality
		 
		 System.out.println(o3.hashCode());
		 System.out.println(o4.hashCode());
		 

	}

}
