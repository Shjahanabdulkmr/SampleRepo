package Hierarchial;

public class HierarchialChild1 extends HierarchialParent {
	public void child1()
	{
		System.out.println("This is Hierarchial Child");
	}

	public static void main(String[] args) {
		HierarchialChild1 obj=new HierarchialChild1();
				obj.parent();
		obj.child1();

	}

}
