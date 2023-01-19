package basics.programms;// garbage collection by using finalized

public class GarbageCollection {
int roll;
String name;
public GarbageCollection(int roll, String name) {
	super();
	this.roll = roll;
	this.name = name;
}
@Override
public String toString() {
	return "GarbageCollection [roll=" + roll + ", name=" + name + "]";
}
@Override
protected void finalize() throws Throwable {
	//System.out.println(this);
	super.finalize();
}
public static void main(String[] args) throws Throwable {
	GarbageCollection g=new GarbageCollection(101,"vaibhav");
	g=new GarbageCollection(102,"vaibhtz") ;
	g.finalize();
	System.gc();
	System.out.println(g);
	
}

}
