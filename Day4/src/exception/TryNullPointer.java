package exception;

public class TryNullPointer {
    public static void main(String[] args) {
        String s=null;

        try{
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("Null Pointer");
            e.printStackTrace();

        }
    }
}
