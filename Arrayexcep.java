// Index out of bounds 
public class Arrayexcep{
    public static void main(String[] args){
	    int n=5;
		int[] arr = new int[] {10,20,30,40,50};
		for(int i=0;i<=n;i++){ // instead of [i] i can write arr.length
			//System.out.println(arr[i]);// when printing the index 5 gives out of bounds, so we going to use try and catch block
			try{
				System.out.println(arr[i]);
			}
			catch (Exception e){
				System.out.println("caught:"+e);
			}
		}
		System.out.println("complete");
	}
}
