package day2;

public class pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		//
		{
			for(int j=5;j>i-1;j--)
				//triangle row is until i only
			{
				System.out.print(" ");
				//dont go to next line
				//gap after star
			}
			for(int j=1;j<=((2*i)-1);j++)
				
				//triangle row is until i only
			{
				System.out.print("*");
				//dont go to next line
				//gap after star
			}
//			for(int j=i;j>=3;j--)
////				//triangle row is until i only
//			{
//			System.out.print("* ");
//				//dont go to next line
////				//gap after star
//			}
//			
			System.out.println();
			//gap for next line
		}

	}

}
