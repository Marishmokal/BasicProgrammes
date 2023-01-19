package basics.programms;//PROGRAMME OF CLONING MEHTOD

import java.util.Objects;

public class EqualsMethod {

	int roll;
	String name;

	public EqualsMethod() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EqualsMethod(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectCloning o = new ObjectCloning(101, "vaibhavd");
		ObjectCloning o2 = (ObjectCloning) o.clone();

//			System.out.println(o.roll+""+o.name);
//			System.out.println(o2.roll+""+o2.name);
		System.out.println(o == (o2));
		System.out.println(o.equals(o2));

	}

}
