import java.util.Stack;
public class Code06 {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void display(Stack<Integer> s){
        for(int i=s.size()-1; i>=0; i--){
            System.out.print(s.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(4);
        s.push(3);
        s.push(2);

        System.out.println("----Before reverse----");
        display(s);
        System.out.println("----After reverse----");
        reverseStack(s);
        display(s);

    }
}
