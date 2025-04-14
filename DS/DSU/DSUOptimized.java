import java.util.Arrays;

public class DSUOptimized extends DisjointSetUnion {

    int[] rank;

    public DSUOptimized(int numberOfNodes) {
        super(numberOfNodes);
        this.rank = new int[numberOfNodes];
        Arrays.fill(rank, 1);

    }

    @Override
    public boolean DSU(int u, int v) {

        int parentOfU = findPathCompression(u);
        int parentOfV = findPathCompression(v);
        if (parentOfU == parentOfV) {
            System.out.println("Cant do dsu for " + u + " " + v + ".");
            return false;
        }
        int rankofU = rank[u];
        int rankofV = rank[v];
        if (rankofU > rankofV) {
            parent[parentOfV] = parentOfU;
        } else if (rankofU < rankofV) {
            parent[parentOfU] = parentOfV;
        } else {
            parent[parentOfV] = parentOfU;
            rank[parentOfU]++;

        }
        return true;
    }

    @Override
    public void display() {
        System.out.println("DSU looks alike:");
        System.out.println("    " + Arrays.toString(parent));
        System.out.println("Rank looks alike:");
        System.out.println("    " + Arrays.toString(rank));
    }

    public static void main(String[] args) {
        DisjointSetUnion dsu = new DSUOptimized(10);
        dsu.DSU(1, 2);
        dsu.DSU(3, 4);
        dsu.DSU(1, 3);
        dsu.DSU(1, 4);
        dsu.display();
    }
}