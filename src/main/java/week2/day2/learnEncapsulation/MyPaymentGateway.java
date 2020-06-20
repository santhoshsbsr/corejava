package week2.day2.learnEncapsulation;

public class MyPaymentGateway {
public void verifyCVV(int cvv) {
	MySecureData data = new MySecureData();
	if(data.getCVV()==cvv) {
		System.out.println("CVV verified");
	}else
	{
		System.out.println("Please check the cvv");
	}
	
}

public static void main(String[] args) {
	new MyPaymentGateway().verifyCVV(123);
	new MyPaymentGateway().depositAmount(50000);
}


public void depositAmount (int money) {
	System.out.println("my curent balance is: " +MySecureData.getBalance());
	MySecureData.setBalance(money);
	System.out.println("balance after deposit " +MySecureData.getBalance());
}
}
