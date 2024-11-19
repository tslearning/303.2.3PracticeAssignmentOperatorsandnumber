public class Question1 {
    public static void main(String[] args) {
        int x = 2;
        System.out.println(Integer.toBinaryString(x)); //print 10
        x = x << 1; //print 100
        System.out.println(Integer.toBinaryString(x));

        int y = 9;
        System.out.println(Integer.toBinaryString(y)); //print 1001
        y = y << 1;
        System.out.println(Integer.toBinaryString(y)); //print 10010

        int c = 17;
        System.out.println(Integer.toBinaryString(c)); //print 10001
        c = c << 1;
        System.out.println(Integer.toBinaryString(c)); //print 100010

        int a = 88;
        System.out.println(Integer.toBinaryString(a)); //print 1011000
        a = a << 1;
        System.out.println(Integer.toBinaryString(a)); //print 10110000
    }
}
