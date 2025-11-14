package oops;

public class SBIBank implements Loan{

	@Override
	public void interestrate(int amt) {
		// TODO Auto-generated method stub
		int ir=amt*3*100;
		System.out.println(ir);
		
	}
	

}
