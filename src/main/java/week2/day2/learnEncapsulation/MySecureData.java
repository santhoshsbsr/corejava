package week2.day2.learnEncapsulation;

public class MySecureData {
private final short cvv = 123;

private static int balance = 0;//since the balance value can not change elsewhere I have declared it as static

public short getCVV() {
	return cvv;
}

public static int getBalance() {
	return balance;
}

public static void setBalance(int balance) {
	MySecureData.balance = balance;
}



}

