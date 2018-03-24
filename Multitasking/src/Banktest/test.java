package Banktest;


public class test {
public static void main(String []args) {
	 final int ACCOUNTS=100;
	 final double INIT_BALANCE=1000;
	 Bank bank=new Bank(ACCOUNTS, INIT_BALANCE);
	 for(int i=0;i<ACCOUNTS;i++) {
		 TransferRunnable runnable=new TransferRunnable(bank, i, INIT_BALANCE);
		 Thread thread=new Thread(runnable);
		 thread.start()
	 }
}
}

