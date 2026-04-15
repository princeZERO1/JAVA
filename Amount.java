class BalanceAmount{
	private int balance ;
    public void deposit(int amount){
		if(amount>0){
			balance=balance+amount;
		}
	}
    public void withdraw(int amount){
		if(amount>0 && amount<=balance){
			balance=balance-amount;
		}
		else{
			System.out.println("Insufficient Amount");
		}
	}
	public int getbalance(){// this is access the private data in balance in line of 2
		return balance;	
	}
}
public class Amount{
	public static void main(String[] args){
		BalanceAmount ob=new BalanceAmount();
		ob.deposit(10000);
		ob.deposit(10000);
		ob.withdraw(5000);
		System.out.println("Balance amount: " +ob.getbalance());
	}	
}
