package oops;

public class Theater2 implements TamMovies{
	int price=0;
	public void pokiri()
	{int ticket=130;
	price+=ticket;
	System.out.println("pokiri price is "+ticket);
	}
	public void leo()
	{int ticket=140;
	price+=ticket;
	System.out.println("leo price is "+ticket);
	}
	public void total()
	{
		System.out.println("total is "+price);
		}
	}


