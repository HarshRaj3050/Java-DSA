
public class Code02 {

    public static class ListNode {

        int data;
        ListNode next;

        ListNode(int val) {
            data = val;
            next = null;
        }
    }
    public static ListNode head = null;

    public static boolean isEmpty() {
        return head == null;
    }

    public static void push(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            ListNode temp = head;
            head = newNode;
            newNode.next = temp;
        }
    }

    public static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public static void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        System.out.println("----Before pop----");
        display();
        System.out.println("----After pop----");
        System.out.println(pop() + " is pop");
        display();
    }
}
