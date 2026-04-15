public class ECE1{
    public static void main(String[] args){
	    for(int i=-3;i<4;i++){
			int a =0; // we given here because in try block it have int a value so we cannot print if its inside so we declare initialize outside of the block
			try{
				a = 13/i;
			}
			catch (Exception e){
				System.out.println("Caught"+e);
			}
			System.out.println(a);
		}
	}
}