/* A Java Program to find distance between n1 and n2 
 using one traversal */
public class Program
{
    // Driver program to test above functions 
    public static void main(String[] args) {

        // Let us create binary tree given in the above example 
        Node  root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);

        System.out.println("Dist(4, 5) = "+ BinaryTree.findDistance(root, 4, 5));
        System.out.println("Dist(4, 6) = "+BinaryTree.findDistance(root, 4, 6));
        System.out.println("Dist(3, 4) = "+BinaryTree.findDistance(root, 3, 4));
        System.out.println("Dist(2, 4) = "+BinaryTree.findDistance(root, 2, 4));
        System.out.println("Dist(8, 5) = "+BinaryTree.findDistance(root, 8, 5));

    }
} 