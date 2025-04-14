public class BinaryTreeClient {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(new PreOrderConstructionStrategyTwo());
        bt.display();
        bt.preOderTraversal();
        bt.preOrderIterative();
        bt.postOderTraversal();
        bt.inOderTraversal();
        bt.inOrderIterative();
        bt.levelOrderTraversal(); //

    }
}
