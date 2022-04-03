import java.util.List;

public class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Constructors
    BinaryTree(int data) {
        root = new Node(data);
    }

    BinaryTree() {
        root = null;
    }
}

class Solution {
    /*
        returns list of numbers of the parent nodes given by List
    */
    public static void solution(int h, int[] q) {

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* create root */
        tree.root = new Node(1);

        /* following is the tree after above statement

            1
          /   \
        null  null  */

        /* User inputs int h ; 1 <= h <= 30. */

        // create perfect binary trees with 2^(n-1) and number in post-order transversal


    }
}

