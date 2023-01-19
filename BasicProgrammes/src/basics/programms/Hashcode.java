package basics.programms;//hashcode programme

import java.util.Objects;

public class Hashcode {
private String name;
//private int rollNo;


public String getName()
{
	return name;
}
public Hashcode(String name) {
	super();
	this.name =name;
}
public void setName()
{
	this.name=name;
	
}
//public boolean equals(Object o) {
//	if(o==this)
//		return true;
//	if(o instanceof Hashcode) {
//		Hashcode h1=(Hashcode)o;
//	{
//		if(name.equals(h1.name)) {
//			return true;
//		}
//		return false;
//	}
//}return false;
//}

public static void main(String args[])//throws CloneNotSupportedException
{
	Hashcode h=new Hashcode("name");
	System.out.println(h.getName());
	System.out.println(h.hashCode());
	
	Hashcode h2=new Hashcode("name");
	System.out.println(h2.getName());
	System.out.println(h2.hashCode());
	
	System.out.println(h==h2);

	System.out.println(h.equals(h2));
}
@Override
public int hashCode() {
	return Objects.hash(name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Hashcode other = (Hashcode) obj;
	return Objects.equals(name, other.name);
}
}
