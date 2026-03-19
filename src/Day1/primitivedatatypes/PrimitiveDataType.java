package Day1.primitivedatatypes;

public class PrimitiveDataType {
    public static void main(String[] args){
//        int i=5;
//        i+=5;
//        System.out.println("i=" + i);
//
//        float f=5.5f;
//        System.out.println("f=" + f);
//
//        double d=5.5;   //redeclaration is not allowed
//        System.out.println("d=" + d);
//
//        char c='D';
        String s1="Ashish";
        //System.out.println(c);
        System.out.println(s1);

        String s2 = new String("Ashish");
        String s3="Ashish";

//        if(s1==s2)      //not equal as both has diff address
//            System.out.println("Equal");
//        else
//            System.out.println("Not Equal");
////-----------------------------------------------------------------------
//        if(s1.equals(s2))      //equal as both has same value-check for values
//            System.out.println("Equal");
//        else
//            System.out.println("Not Equal");
////-----------------------------------------------------------------------
//        if(s1==s3)      //equal as both has same address-check for address
//            System.out.println("Equal");
//        else
//            System.out.println("Not Equal");
//-----------------------------------------------------------------------

        s1 = new String("Dhriti");
        System.out.println(s1);
    }
}
