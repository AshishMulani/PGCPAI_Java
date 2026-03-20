public class PascalTriangle {

    public static void main(String[] args) {

        int num=1;
        for(int i=1; i<8; i++){
            //System.out.print(num);

            for(int j=1; j<i+1; j++){

                if(j==1 || j==i )
                    System.out.print(num);
                else
                    System.out.print("0");

            }
            System.out.println();
        }

    }

    }

