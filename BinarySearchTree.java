import java.util.ArrayList;
import java.util.List;

/**
 * print in inorder way, and get sorted list
 * 
 */
public class BinarySearchTree {
    BSTNode root;
    
    // insertion
    public void insert(int data) {
        
        // this means, i am adding to the binary search tree for the first time
        if (root == null) {
            root = new BSTNode(data);
            return;
        }
        insertUtil(data, root);
    } 

    // 20, Node(15)
    private BSTNode insertUtil(int data, BSTNode node) {
        
        if (node == null) {
            return new BSTNode(data);
        }

        if (data > node.data) {
            node.right = insertUtil(data, node.right);
        } else {
            node.left = insertUtil(data, node.left);
        }
        return node;
    }

    // searching
    
    /**
     * 
     * @param target - the value to search
     * @return True if value is found, otherwise false
     */
    public boolean search(int target) {
        if (root == null) {
            return false;
        }
        return search(root, target);
    }

    private boolean search(BSTNode node, int target) {

        if (node == null) {
            return false;
        }

        if (node.data == target) {
            return true;
        }

        if (target > node.data) {
            return search(node.right, target);
        } else {
            return search(node.left, target);
        }
    }

    // printing

    public void print() {
        if (root == null) {
            System.out.println("There is no data in the tree");

        }


        printInOrder(root);
    }

    private void printInOrder(BSTNode node) {
        if (node == null) {
            return;
        }


        printInOrder(node.left);
        System.out.println(node.data);
        printInOrder(node.right);
    }

    public List<Integer> buildInorderArray() {
        if (root == null) {
            return new ArrayList<>();
        }
        return buildInorderArrayUtil(root, new ArrayList<>());
    }

    private List<Integer> buildInorderArrayUtil(BSTNode node, List<Integer> collector) {
        
        if (node == null) {
            return collector;
        }
        buildInorderArrayUtil(node.left, collector);
        collector.add(node.data);
        buildInorderArrayUtil(node.right, collector);
        
        return collector;
    }
}