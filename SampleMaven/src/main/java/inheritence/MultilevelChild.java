package inheritence;

public class MultilevelChild extends multilevelparent
{
public void child()
{
	System.out.println("This is child");
}
	public static void main(String[] args) {
		
		MultilevelChild obj=new MultilevelChild();
		obj.multilevelgrandparent();
		obj.parent();
		obj.child ();

	}

}
