package basics.programms;
enum Beer15
{
	KF(70),KO(80),RC(90),FO;
	int price;
	Beer15(int price)
	{
		this.price=price;
	}
	Beer15()
	{
		this.price=60;
	}
	public int getPrice()
	{
		return price;
	}
}
public class Test153 {
public static void main(String[] args) {
	Beer15 []c=Beer15.values();
	for(Beer15 c1:c)
	{
		System.out.println(c1+" "+c1.getPrice());
	}
}
}
