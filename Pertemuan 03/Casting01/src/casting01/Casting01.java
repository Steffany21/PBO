
package casting01;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        byte a = (byte) 128;

//        Declare and initialize a short with a value of 128
          short b = 128;
        System.out.println((byte)b);
//        Create a print statement that casts this short to a byte
        byte c = 127;
        c = (byte) (c + 1);
        System.out.println(c);
        c = (byte) (c + 1);
        System.out.println(c);
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
    }    
}