import java.util.LinkedList;
import java.util.Queue;

public class Code01 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class BinaryTree {

        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Pre-Order Traversal
        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // In-Order Traversal
        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // Level-Order Traversal
        public static void levelOrder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) {
                    System.out.println();
                    if(!q.isEmpty()) {
                        q.add(null);
                    }
                } else {
                    if (q.isEmpty()) {
                        break;
                    }
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                    System.out.print(curr.data + " ");
                }
            }
        }


        // Height of Tree
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            
            int left = height(root.left);
            int right = height(root.right);
            return Math.max(left,right)+1;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.print("Pre Order : ");
        tree.preOrder(root);

        System.out.print("\nIn Order : ");
        tree.inOrder(root);

        System.out.println("\nLevel Order : ");
        tree.levelOrder(root);

        System.out.print("\nHeight of Tree : ");
        int height = tree.height(root);
        System.out.println(height);
    }
}
