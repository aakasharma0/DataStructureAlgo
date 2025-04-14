import java.util.Scanner;

public class PreOrderConstruction implements IConstructStrategy {

    Scanner sc = new Scanner(System.in);

    @Override
    public Node createTree() {
        int data = sc.nextInt();

        if (data == -1)
            return null;
        Node root = new Node(data);
        root.left = createTree();
        root.right = createTree();
        return root;
    }

}
