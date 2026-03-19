package Day1.Array;

public class ArrayHandling {
    public static void main(String[] args) {

        int iArray[] = new int[5];
//        int iArray1[]= {10,20,40};
//        String strArray[]=new String[10];
        int j=10;

        for(int i=0; i< iArray.length; i++){
            iArray[i]=j++;
        }

        System.out.println(iArray);  //returns the add of array

        for(int i=0; i< iArray.length; i++) {
            System.out.println(iArray[i]);
        }
    }
}