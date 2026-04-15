//Question: Valid Parenthesis or not ===> {{}}[()]-> valid , [(])-> Invalid(unbalanced) , )[](-> Invalid
//Input==> {[()]} , Output==> Balanced Parenthesis

import java.util.*;
public class Balancedornot{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		boolean b=valid(str);
		if(b==true){
			System.out.println("Balanced");
		}
		else
			System.out.println("Unbalanced");
	}
	public static boolean valid(String str){
		Stack<Character> st = new Stack<Character>();
		for (int i=0;i<=5;i++){
			char ch = str.charAt(i);
			if (ch=='{' || ch=='(' || ch=='['){
				st.push(ch);
			}
			else{
				if(!st.isEmpty()){
					char top = st.peek();
			        if(ch==')' && top=='(' || ch==']' && top=='[' || ch=='}' && top=='{'){
						st.pop();
					}
				}
				else
					return false;
				
			}
		}
		if(st.isEmpty())
			return true;
		else
			return false;
	}
}