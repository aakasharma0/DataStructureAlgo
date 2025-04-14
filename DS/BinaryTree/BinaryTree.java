import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class BinaryTree {

    Scanner sc = new Scanner(System.in);
    IConstructStrategy constructStrategy;

    Node rootNode;

    public BinaryTree(IConstructStrategy constructStrategy) {
        this.constructStrategy = constructStrategy;
        this.rootNode = constructStrategy.createTree();
    }

    public void display() {
        display(rootNode);
    }

    private void display(Node rootNode) {
        if (rootNode == null)
            return;
        String leftValue = rootNode.left == null ? "  " : Integer.toString(rootNode.left.data) + " -> ";
        String rootValue = Integer.toString(rootNode.data);
        String rightValue = rootNode.right == null ? "  " : " <- " + Integer.toString(rootNode.right.data);
        System.out.println(leftValue + rootValue + rightValue);
        display(rootNode.left);
        display(rootNode.right);
    }

    public void preOderTraversal() {
        System.out.println("Preorder : ");
        preOderTraversal(this.rootNode);
        System.out.println();
    }

    private void preOderTraversal(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOderTraversal(root.left);
        preOderTraversal(root.right);
    }

    public void postOderTraversal() {
        System.out.println("Post order ");
        postOderTraversal(this.rootNode);
        System.out.println();
    }

    private void postOderTraversal(Node root) {
        if (root == null)
            return;
        postOderTraversal(root.left);
        postOderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public void inOderTraversal() {
        System.out.println("In Order ");
        inOderTraversal(this.rootNode);
        System.out.println();

    }

    private void inOderTraversal(Node root) {
        if (root == null)
            return;
        inOderTraversal(root.left);
        System.out.print(root.data + " ");
        inOderTraversal(root.right);
    }

    public void levelOrderTraversal() {
        System.out.println("Level order treversal");
        levelOrderTraversal(rootNode);
        System.out.println();
    }

    private void levelOrderTraversal(Node root) {

        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node frontNode = q.poll();
            if (frontNode == null) {
                System.out.println();
                if (!q.isEmpty())
                    q.add(null);
                continue;
            }

            System.out.print(frontNode.data + " ");
            if (frontNode.left != null)
                q.add(frontNode.left);
            if (frontNode.right != null)
                q.add(frontNode.right);

        }
    }

    public void preOrderIterative() {
        System.out.println("Preorder Iterative solution");
        if (rootNode == null)
            return;

        Stack<Quad> stk = new Stack<>();
        stk.push(new Quad(rootNode));
        while (!stk.isEmpty()) {
            Quad quad = stk.peek();

            if (!quad.isSelfDone) {
                System.out.print(quad.node.data + " ");
                quad.isSelfDone = true;
            } else if (!quad.isleftDone) {
                if (quad.node.left != null) {
                    stk.push(new Quad(quad.node.left));
                }
                quad.isleftDone = true;
            } else if (!quad.isRightDone) {
                if (quad.node.right != null) {
                    stk.push(new Quad(quad.node.right));
                }
                quad.isRightDone = true;
            } else {
                stk.pop();
            }

        }
        System.out.println();
    }

    public void inOrderIterative() {
        System.out.println("InOrder Iterative solution");
        if (rootNode == null)
            return;

        Stack<Quad> stk = new Stack<>();
        stk.push(new Quad(rootNode));
        while (!stk.isEmpty()) {
            Quad quad = stk.peek();

            if (!quad.isleftDone) {
                if (quad.node.left != null) {
                    stk.push(new Quad(quad.node.left));
                }
                quad.isleftDone = true;
            } else if (!quad.isSelfDone) {
                System.out.print(quad.node.data + " ");
                quad.isSelfDone = true;
            } else if (!quad.isRightDone) {
                if (quad.node.right != null) {
                    stk.push(new Quad(quad.node.right));
                }
                quad.isRightDone = true;
            } else {
                stk.pop();
            }

        }
        System.out.println();
    }
}