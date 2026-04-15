import java.util.Scanner;//example of StringBuffer is mutable
public class Stringb{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enetr the first string: ");
		String s1=s.nextLine();
		System.out.println("Enetr the second string: ");
		String s2=s.nextLine();
		int[] count= new int[256];
		disp(s1,s2,count);
	}
	public static void disp(String s1, String s2, int[] count){
		if (s1.length()!=s2.length() 	){
			System.out.println("Not an anagram of the given String ");
		}
		else{
			for(int i=0;i<s1.length();i++){
				char ch1 = s1.charAt(i);
				int index1 = (int) ch1;
				count[index1]++;
				
				char ch2 = s2.charAt(i);
				int index2 = (int) ch2;
				count[index2]--;
			}
			boolean var =true;
			for(int i=0;i<count.length;i++){
				if(count[i]!=0){
					var=false;
					break;
				}
			}
			if(var==true)
				System.out.println("The given two strings Anagram ");
			else
				System.out.println("The given two string is Not an Anagram");
		}
	}
}			