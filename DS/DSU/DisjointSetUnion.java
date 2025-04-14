import java.lang.reflect.Array;
import java.util.Arrays;

public class DisjointSetUnion {

    int numberOfNodes;
    int parent[];

    public DisjointSetUnion(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        parent = new int[numberOfNodes];
        Arrays.fill(parent, -1);
    }

    public boolean DSU(int u, int v) {
        int parentOfU = findPathCompression(u);
        int parentOfV = findPathCompression(v);
        if (parentOfU == parentOfV) {
            System.out.println("Cant do DSU for " + u + " " + v + " ");
            return false;
        }
        parent[parentOfU] = parentOfV;

        return true;
    }

    private int find(int u) {
        if (parent[u] == -1)
            return u;
        return find(parent[u]);
    }

    protected int findPathCompression(int u) { // path comression just remember will work if that will be asked for
                                               // compression like quering for some parent node
        if (parent[u] == -1)
            return u;
        return parent[u] = findPathCompression(parent[u]);
    }

    public void display() {
        System.out.println("DSU looks alike:");
        System.out.println("    " + Arrays.toString(parent));
    }

    public static void main(String[] args) {
        DisjointSetUnion dsu = new DisjointSetUnion(10);
        dsu.DSU(1, 2);
        dsu.DSU(3, 4);
        dsu.DSU(1, 3);
        dsu.DSU(1, 4);
        dsu.display();

    }
}