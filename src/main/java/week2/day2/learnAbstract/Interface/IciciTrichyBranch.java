package week2.day2.learnAbstract.Interface;

public class IciciTrichyBranch {
public static void main(String[] args) {
	RBI branch = new IciciBank(); //this is called scope restriciton where we can only see only the meathods from RBI
	branch.createDeposites();
	branch.provideDebitCard(1234122312341234L);
	//branch.loanToIt();// is not accessbli since we have enabled scope restriction to follow only the RBI
	branch.provideHomeLoan();
	//RBI.lendLoans();// after java 1.8 we can also create a static meathod in interface
	
}

}
