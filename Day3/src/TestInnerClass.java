public class TestInnerClass {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.intOuter = 0;

        OuterClass.Innerclass ic = oc.new Innerclass();
    }
}
