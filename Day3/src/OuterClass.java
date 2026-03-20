public class OuterClass {
    int intOuter = 10;

    public class Innerclass{
        int intInner = 20;
        public void doInnerSomething(){
            intOuter = 20;

        }
    } //scope ended
    public void doOuterSomething(){
       Innerclass ic = new Innerclass();
        ic.intInner = 20;

    }

}
