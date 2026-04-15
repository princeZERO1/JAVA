class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String str){
		super(str);
	}
}
	class Balanceamount{
		private int balance;
		public void deposit(int amt){
			if(amt>0)
				balance = balance + amt;
			else
				System.out.println("amt must be positive number");
		}
		public void withdraw(int amt) throws InsufficientFundsException{ //method  //throws is used to find if there is exception or not because there is possibility
			if(amt>0 && amt<=balance)   // when we  create the manual exception we  have to give message
				balance = balance-amt;
			else 
				throw new InsufficientFundsException("Insufficient balance");
		}
		public int getBalance(){
			return balance;
		}
	}
public class Balance{
	public static void main(String[] args){
		Balanceamount ob = new Balanceamount();
		ob.deposit(10000);
		ob.deposit(10000);
		try{
			ob.withdraw(25000);
		}
		catch(Exception e){
			System.out.println("caught "+e);
		}
		System.out.println(ob.getBalance());
	}
}