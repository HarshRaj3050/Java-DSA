

public class Code01 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public void inPosition(int idx, int data){
        if(idx == 1) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = idx-1;
        while(i > 1){
            temp = temp.next;
            i--;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static int search(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = search(head.next, key);

        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    public static int recSearch(int key){
        return search(head, key);
    }

    public static void main(String[] args) {
        Code01 ll = new Code01();
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLast(8);
        ll.addLast(9);
        ll.inPosition(3, 45);
        ll.print();
        System.out.println("\nSize of LinkedList : " + ll.size);

        System.out.print("Number is find in the index no. = " + recSearch(8));
    }    
}
