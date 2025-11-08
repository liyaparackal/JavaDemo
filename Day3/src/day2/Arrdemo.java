package day2;

public class Arrdemo {
	Arrdemo()
	{this(5);
		System.out.println("cons");
		
	}
	Arrdemo(int f)
	{
		System.out.println("cons is "+f);
		////////////
	}//cons overloading
	void eat()
	{	this.eat(4);
		System.out.println("eat");
	}
	void eat(int s)
	{
		System.out.println("eat"+s);
	}
	
	public static void main(String[] args) {
		Arrdemo a=new Arrdemo();
		a.eat();
		a.eat(9);
		//calling constructrs via objects
		new Arrdemo(4);
//		Fir;st:{
//			for (int i=0;i<5;i++)
//			{
//				Second:
//				for (int j=0;j<5;j++)
//				{
//					if(j==2)
//					{
//						break First;
//					}
//					System.out.println("i "+i+" j "+j);
//				}
//			}
//			
//		}

	}

}
