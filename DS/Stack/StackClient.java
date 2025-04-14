public class StackClient {
    public static void main(String[] args) {
        IStack stack = new ArrayStackDynamic();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(3);
        // System.out.println(stack.peek());
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();

        stack.display();
    }
}
