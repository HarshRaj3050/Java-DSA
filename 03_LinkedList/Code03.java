

public class Code03 {
    public static class ListNode{
        int val;
        ListNode prev;
        ListNode next;
        ListNode(int data){
            val = data;
            prev = null;
            next = null;
        }
    }
    public static ListNode head = null;
    public static ListNode tail;
    public static int count=0;

    public static void add(int data){
        ListNode ll = new ListNode(data);
        if(head == null){
            head = ll;
            tail = head;
        } else {
            tail.next = ll;
            ll.prev = tail;
            tail = tail.next;
        }
    }

    public static void removeAtEnd(){
        tail = tail.prev;
        tail.next.prev = null;
        tail.next = null;
    }

    public static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp  = temp.next;
        }
        System.out.println(); // for next line only
    }

    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next; // for extra line for doubly linked-list
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        System.out.println("----Before remove----");
        display(head);
        System.out.println("----After remove-----");
        removeAtEnd();
        display(head);
        System.out.println("----After the reverse the linked-list----");
        head = reverse(head);
        display(head);


    }
}
