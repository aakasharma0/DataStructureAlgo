import java.util.Scanner;

public class PreOrderConstructionStrategyTwo implements IConstructStrategy {

    int currentIndex = 0;
    int[] preOrderArray;

    public PreOrderConstructionStrategyTwo() {
        preOrderArray = new int[] { 10, 20, 40, -1, -1, 50, -1, -1, 30, 60, -1, -1, 70, -1, -1 };
    }

    @Override
    public Node createTree() {
        int data = preOrderArray[currentIndex];
        currentIndex++;

        if (data == -1)
            return null;
        Node root = new Node(data);
        root.left = createTree();
        root.right = createTree();
        return root;
    }
}
