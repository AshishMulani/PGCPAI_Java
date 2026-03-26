package BankApp;

public class Encryption {
    public static String encrypt(String password){
        StringBuilder result = new StringBuilder();

        for (char ch : password.toCharArray()){
            result.append((char) (ch+3));
        }
        return result.toString();
    }

//    public static boolean match(String origpass, String encypass){
//        String encrypted = encrypt(origpass);
//        return encrypted.equals(encypass);
//    }

    public static String decrypt(String password){
        StringBuilder result = new StringBuilder();

        for (char ch : password.toCharArray()){
            result.append((char) (ch-3));
        }
        return result.toString();
    }
}
