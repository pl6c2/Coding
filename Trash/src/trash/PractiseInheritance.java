package trash;

class Parent
{
	public void show()
	{
		System.out.println("dude");
	}
}

public class PractiseInheritance extends Parent {
	
	public void childmethod()
	{
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		
		Parent p=new PractiseInheritance();
		p.show();
//         p.childmethod();
		PractiseInheritance c=(PractiseInheritance) p;
		c.childmethod();
	}

}
