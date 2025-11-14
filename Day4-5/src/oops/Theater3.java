package oops;

public class Theater3 implements MalMovies,TamMovies{
	int price=0;
	public void lokah()
	{
		int ticket=150;
		price+=ticket;
		System.out.println("lok"+ticket);}
	public void drishyam()
	{int ticket=150;
	price+=ticket;
	System.out.println("drshym"+ticket);
		}
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
		System.out.println("total is "+price);}
	}


