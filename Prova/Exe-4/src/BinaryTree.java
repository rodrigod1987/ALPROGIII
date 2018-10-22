public class BinaryTree {
    static int d1 = -1;
    static int d2 = -1;
    static int dist = 0;

    // Returns level of key k if it is present in tree,
    // otherwise returns -1
    private static int findLevel(Node root, int k, int level)
    {
        // Base Case
        if (root == null)
            return -1;

        // If key is present at root, or in left subtree or right subtree,
        // return true;
        if (root.key == k)
            return level;

        int l = findLevel(root.left, k, level + 1);
        return (l != -1)? l : findLevel(root.right, k, level + 1);
    }

    private static Node findDistUtil(Node root, int n1, int n2, int lvl){

        if (root == null)
            return null;

        if (root.key == n1){
            d1 = lvl;
            return root;
        }
        if (root.key == n2)
        {
            d2 = lvl;
            return root;
        }

        Node left_lca = findDistUtil(root.left, n1, n2,  lvl + 1);
        Node right_lca = findDistUtil(root.right, n1, n2,  lvl + 1);

        if (left_lca != null && right_lca != null)
        {
            dist = (d1 + d2) - 2*lvl;
            return root;
        }

        return (left_lca != null)? left_lca : right_lca;
    }

    public static int findDistance(Node root, int n1, int n2){
        d1 = -1;
        d2 = -1;
        dist = 0;
        Node lca = findDistUtil(root, n1, n2, 1);

        // If both n1 and n2 were present in Binary Tree, return dist
        if (d1 != -1 && d2 != -1)
            return dist;

        // If n1 is ancestor of n2, consider n1 as root and find level
        // of n2 in subtree rooted with n1
        if (d1 != -1)
        {
            dist = findLevel(lca, n2, 0);
            return dist;
        }

        // If n2 is ancestor of n1, consider n2 as root and find level
        // of n1 in subtree rooted with n2
        if (d2 != -1)
        {
            dist = findLevel(lca, n1, 0);
            return dist;
        }

        return -1;
    }
}
