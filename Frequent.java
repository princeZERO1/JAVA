//import java.util.Scanner;// most frequent character like input as = engineer and output is "e"
//import java.util.Arrays;
import java.util.*;
public class Frequent{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = s.nextLine();
		char[] arr=st.toCharArray();
		disp(arr);
	}
	public static void disp(char[] arr){
		Arrays.sort(arr);
		int max=1;
		int count=1;
		char ch = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]==arr[i-1]){
				count++;
			}
			else{
				if(count>max){
					max=count;
					ch = arr[i-1];
				}
				count=1;
			}
		}
		if(count>max){
			max=count;
			ch = arr[arr.length-1];
		}
		System.out.println("The most Frequent character in the given String is:" + ch);
	}
}