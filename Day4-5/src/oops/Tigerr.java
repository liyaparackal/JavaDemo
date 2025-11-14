package oops;

public class Tigerr implements Animal {
public void eat()
{
	super.eat();
	System.out.println("eats veg");
	}
public void run()
{
	System.out.println("runs fast");}
public static void main(String[] args) {
		Tigerr t=new Tigerr();
		t.eat();
		t.run();
		System.out.println(Animal.legs);
		

	}

}
