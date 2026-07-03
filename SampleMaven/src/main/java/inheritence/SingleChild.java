package inheritence;

public class SingleChild extends SingleParent {
public void display()
{
	System.out.println("This is a child class");
}
	
public static void main(String[] args) {
	
	SingleChild obj=new SingleChild();
	obj.print();
	obj.display();// TODO Auto-generated method stub

	}

}
