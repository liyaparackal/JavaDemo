package oops;

public class Bat implements Animal,Bird {
	
	public void fly()
	{
		System.out.println("flies fast");
	}
public void eat()
{
	System.out.println("eats insects");
	}
public void run()
{
	System.out.println("runs slowly");
	}
	public static void main(String[] args) {
		Bat b=new Bat();
		b.eat();
		b.run();
		b.fly();
	}

}
