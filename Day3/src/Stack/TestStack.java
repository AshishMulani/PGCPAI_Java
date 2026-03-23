package Stack;

public class TestStack {

    public static void main(String[] args) {
        StackOperations st = new StackOperations(5);


        st.push(10);
        st.push(20);
        st.push(30);


        System.out.println("Popped: " + st.pop()); // Returns 30
        System.out.println("Top element is: " + st.peek()); // Returns 20
    }
}
