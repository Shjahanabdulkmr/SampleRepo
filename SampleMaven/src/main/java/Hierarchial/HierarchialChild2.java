package Hierarchial;

public class HierarchialChild2 extends HierarchialChild1 {
public void child2()
{
	System.out.println("This is Hierarchial Child2");
}
	public static void main(String[] args) {
		HierarchialChild2 obj= new HierarchialChild2();
		obj.child2();
		obj.child1();
		obj.parent();

	}

}
