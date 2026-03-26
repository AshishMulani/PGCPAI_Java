package exception;

import java.util.Scanner;

public class TestCustomeException {

    public static void main(String[] args) {

        try{
            throw new CustomeException();
        }catch (CustomeException ce){
            System.out.println(ce.getMessage());
        }
    }
}
