public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //variables

        // 4 integer-based types

        byte value = 28;                // values range from -128 to 127                     8-bit
        short  anotherValue = 15937;    // value range from -32768 to 32767                 16-bit
        int mostPopularValue = 42;      // value range from -21474837 to 21474837           32-bit
        long extremelyBigNumbers = -831;// value range from -9 quintillion to 9 quintillion 64-bit

        //2 real numbers types (can have decimals)

        float realValue = (float) 3.6;                 // values range from -big to big with ~7 digits    32-bit
        double popularRealValue = -324.86245;  //  """" with ~25 significant digits               64-bit

        //boolean (true/false)
        boolean lightSwitch = true;    // only values of true or false


        //character data -- a SINGLE character
        char singleCharacter = '#';    // unicode 65535 integers
                                       //  'A' == 65  'a' == 97 '0' == 48
                                       // 01000001     01100001  00110000

        //strings - collections of information between quotation marks
        String schoolName = "Lubbock High School";

    }
}