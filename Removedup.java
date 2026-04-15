import java.util.*;
public class Removedup{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = s.nextLine();
		int[] count=new int[26];
		disp(st,count);
	}
	public static void disp(String st,int[] count){
		StringBuilder str=new StringBuilder();
		for(int i=0;i<st.length();i++){
			char ch = st.charAt(i);
			int index = (int)ch-97;
			if(count[index]==0){
				str.append(ch);
				count[index]++;
			}
		}
		System.out.println("The removed duplicate String: " + str.toString());
	}
}