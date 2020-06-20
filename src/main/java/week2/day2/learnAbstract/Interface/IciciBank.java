package week2.day2.learnAbstract.Interface;

public class IciciBank implements RBI,IciciHeadOffice{

	
	public void createDeposites() {
		// TODO Auto-generated method stub
		System.out.println("you can create a deposits with min balance or rs.5000: " +minimumBalance);
	}

	public void provideDebitCard(long cardNumber) {
		// TODO Auto-generated method stub
		System.out.println("you can create withdrawals:  " +cardNumber);
	}

	//normal meathods can also be declared in the implemented java class
	public void loanToIt() {
		System.out.println("debit card provided");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(limit);
	
		
	
}


	public void provideGoldLoad() {
		// TODO Auto-generated method stub
		System.out.println("provide gold load");
	}

	public void holidays() {
		// TODO Auto-generated method stub
		System.out.println("work from home");
	}

	public void provideHomeLoan() {
		// TODO Auto-generated method stub
		System.out.println("home load granted");
	}

	public void lendGOIfacilities() {
		// TODO Auto-generated method stub
		
	}

	

	
}
