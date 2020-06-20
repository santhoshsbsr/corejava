package week2.day2.learnAbstract.Interface;

public interface RBI extends GOI {
	/*from java 1.8 we can declare static meathods like below*/
//public static void lendLoans() {
//	System.out.println("loans provided");
//}

	
	//variable declation
	//any variable declared in interface is STATIC AND FINAL by default...
	public int limit = 900000; // is the retention limit where every bank has to set a retention limit
	public int minimumBalance = 5000;
	// meathod
	// any meathod in interface is by default abstract
	
	public void createDeposites();// we can not have a meathod body in the interface
	// we can only have meathod signatures as abstract meathod but not an implementations or a body for a abstract meathod.

	public abstract void provideDebitCard(long cardNumber); // we can also use abstract keyword while create a meathod /abstract meathod in interface

	public void provideHomeLoan();
	





}
