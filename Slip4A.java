
import java.io.DataInputStream;

class Slip4A {

    public static void main(String args[]){

        DataInputStream dr = new DataInputStream(System.in);

        try {

            System.out.print("Enter String : ");

            String str = dr.readLine();

            for(int i=0;i<str.length();i+=2) {

                System.out.print(" " + str.charAt(i));

            }

        } catch (Exception e) {}

    }

}

