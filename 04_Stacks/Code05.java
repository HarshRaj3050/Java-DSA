import java.util.Stack;
public class Code05 {
    public static String reverseString(String name){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<name.length(); i++){
            s.push(name.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            char pop = s.pop();
            result.append(pop);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        System.out.print(reverseString("Harsh"));
    }
}
