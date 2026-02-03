
import java.util.ArrayList;

public class Code01 {
    
    static class Stack{
        static ArrayList<Integer> arr = new ArrayList<>();

        public static boolean isEmpty(){
            return arr.isEmpty();
        }

        public static void push(int data){
            arr.add(data);
        }

        public static int pop(){
            if(isEmpty()) {
                return -1;
            }
            int top = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            return top;
        }
        
        public static int peek(){
            return arr.get(arr.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
