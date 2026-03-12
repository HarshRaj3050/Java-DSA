
import java.util.Stack;

public class Code07 {

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // while 
            while (!s.empty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // if else 
            if(s.empty()){
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            // push the array element
            s.push(i);
        }

        for(int i=0 ;i<nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
    }
}
