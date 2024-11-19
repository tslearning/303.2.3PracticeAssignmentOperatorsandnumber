public class Question2 {
    public static void main(String[] args) {
        int x = 150;
        System.out.println(Integer.toBinaryString(x)); //Print 10010110
        x = x >> 2;
        System.out.println(Integer.toBinaryString(x)); //Print 100101

        int y = 225;
        System.out.println(Integer.toBinaryString(y)); //Print 1110001
        y = y >> 2;
        System.out.println(Integer.toBinaryString(y)); //Print 111000

        int a = 1555;
        System.out.println(Integer.toBinaryString(a)); //Print 11000010011
        a = a >> 2;
        System.out.println(Integer.toBinaryString(a)); //Print 110000100

        int b = 32456;
        System.out.println(Integer.toBinaryString(b)); //Print 111111011001000
        b = b >> 2;
        System.out.println(Integer.toBinaryString(b)); //Print 1111110110010
    }
}
