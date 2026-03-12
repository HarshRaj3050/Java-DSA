public class Code01 {
    public static class Queue {
        static int arr[];
        static int size;
        static int rear = -1, front = -1;
        Queue(int n){
            arr = new int[n];
            size = n;
        }

        static boolean isEmpty(){
            return rear == -1;
        }

        static boolean isFull(){
            return (front+1)%10
        }

        static void push(int data){
            if(isEmpty()){
                System.out.println("Queue is full");
                return;
            }
            front++;
            arr[front] = data;
        }



    }
    public static void main(String []args){
        
    }
}
