package encapsulation;

public class Encap1 
{
	private String name;
	private int age;
public void setter(String name,int age)//set values
{
		this.name=name;
		this.age=age;
}
public void getter()//access value
{
	System.out.println(name);
	System.out.println(age);
	
}
}
