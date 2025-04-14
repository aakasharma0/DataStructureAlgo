public class Quad {
    Node node;
    boolean isSelfDone;
    boolean isleftDone;
    boolean isRightDone;

    public Quad(Node node) {
        this.node = node;
        isSelfDone = isRightDone = isleftDone = false;
    }
}
