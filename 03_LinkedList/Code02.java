import java.util.LinkedList;

public class Code02 {
    public static void main(String []args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(1);
        // ll.removeFirst();
        // ll.removeLast();
        System.out.print(ll);
    }
}
