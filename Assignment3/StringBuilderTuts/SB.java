package StringBuilderTuts;

public class SB {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("alicebob");
        sb.append(" ").append('c');
        sb.append(1);

        sb.insert(0, "Akash Sharma ");
        System.out.println(sb.toString());
    }
}
