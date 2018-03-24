package Banktest;

public class TransferRunnable implements Runnable{
	private Bank bank;
	private int fromAccount;
	private double maxAmount;
	private int DELAY=10;
	
	public TransferRunnable(Bank bank,int from,double amount) {
		this.bank=bank;
		this.fromAccount=from;
		this.maxAmount=amount;
	}
	@Override
	public void run() {
		try {
			while(true) {
				int toAccount=(int)(bank.size()*Math.random());
				double addamount=maxAmount*Math.random();
				bank.transfer(fromAccount, toAccount, addamount);
				Thread.sleep((int)(DELAY*Math.random()) );
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
