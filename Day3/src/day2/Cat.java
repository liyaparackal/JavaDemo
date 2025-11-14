package day2;
import java.util.Scanner;
public class Cat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int ar[]= {1,2,3};
		int b[][]=new int[2][2];
		
		//accessing in reverse order
//		for(int i=ar.length-1;i>=0;i--)
//		{
//			System.out.println(ar[i]);
//		}
		//enhanced for loop -for int i in array
//		for(int i:ar)//for i in ar
//		{
//			System.out.println(i);
//		}
		//creating empty array-with size and def zeros
		
		//use for loop to get ip to fill array
		System.out.println("enter marks");
		for(int i=0;i<2;i++)
		{for(int j=0;j<2;j++)
		{
			b[i][j]=sc.nextInt();}
		}
		for(int i=0;i<2;i++)
			{for(int j=0;j<2;j++)
			{System.out.print(b[i][j]+"\t");
			//use print to avoid next line in same row
			}
			//after a row put println for next line
			System.out.println();
		}
		


	}

}
