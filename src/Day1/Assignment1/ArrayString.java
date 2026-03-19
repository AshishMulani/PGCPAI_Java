package Day1.Assignment1;

//class ArrayString {
//
//    public static void main(String[] args) {
//
//        String[] sArray = new String[5];
//
//
//        sArray[0] = "Apple";
//        sArray[1] = "Banana";
//        sArray[2] = "Mango";
//        sArray[3] = "Orange";
//        sArray[4] = "Grapes";
//
//
//        for (int i = 0; i < sArray.length; i++) {
//            System.out.println(sArray[i]);
//
//
//        }
//    }
//}


class ArrayString {

    public static void main(String[] args) {

        String[] sArray = {"Apple", "Banana", "Mango", "Orange", new String("Grapes")};

        for (String fruit : sArray) {
            System.out.println(fruit);
        }
    }
}