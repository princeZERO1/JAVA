//String out of bounds
public class Stringexcep{
    public static void main(String[] args){
		String str ="students";
        for (int i=0;i<str.length();i++){
			try{
	            System.out.println(str.charAt(i));
	        }
	        catch(Exception e){
		        System.out.println(e);
	        }		
		}
		System.out.println("complete");
	}
}
