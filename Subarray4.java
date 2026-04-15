// the subarrays in the note pad till now is fixed window 
// now we going to write the code for variable window for array
//longest substring without repeating elements
import java.util.*;
public class Subarray4{
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the string: ");
	    String str = s.nextLine();
		disp(str);
	}
	public static void disp(String str){
		int max=0;
		
		boolean[] vis = new boolean[26];
		int i=0;
		int j=0;
		int Count = 0;
		while(j<str.length()){
			while(vis [str.charAt(j)-'a']==true){
				vis[str.charAt(i)-'a'] = false;
				i++;
			}
			vis[str.charAt(j)-'a']=true;
		    Count = j-i+1; //0-0+1
			if(Count>max){
				max=Count;
			}
			j++;
		}
		System.out.println(Count);
		
	}
}