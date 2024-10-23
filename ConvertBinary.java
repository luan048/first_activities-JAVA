public class ConvertBinary {

    public static int toBinary(int n) {
        return Integer.valueOf(Integer.toBinaryString(n));
    }

    public static void main(String[] args) {
        System.out.println(toBinary(10));
    }
}