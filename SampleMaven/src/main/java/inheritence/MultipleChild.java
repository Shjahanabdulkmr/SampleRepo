package inheritence;

public class MultipleChild implements MultipleParent1,MultipleParent2 {
	public void show()
	{
		System.out.println("This is show Method");
	}
	

	public static void main(String[] args) {
		MultipleChild obj=new MultipleChild();
		obj.Display();
		obj.print();
		obj.show();
		

	}


	@Override
	public void Display() {
		System.out.println("This is display Method");
		
	}


	@Override
	public void print() {
		
		System.out.println("This is print method");
		
	}






}
