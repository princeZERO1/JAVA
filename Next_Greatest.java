import java.util.*;
public class Next_Greatest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = s.nextInt();
    }
    print(n, arr);
	}
    public static void  print(int n, int[] arr){
		Stack<Integer> s = new Stack<Integer>();
		int[] nge = new int[n];
        for(int i = n - 1;i >= 0;i--){
			while(!s.isEmpty() && s.peek() <= arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nge[i] = -1;
        }
        else{
            nge[i] = s.peek();
        }
        s.push(arr[i]);
	}
	for(int i = 0; i < n; i++){
    System.out.println(arr[i] + " -> " + nge[i]);
    }
  }
}