public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;

        System.out.println(num % 10);
        System.out.println(reverseNumber(num));

    }

    static int reverseNumber(int num) {
        int reverseNum = 0;
        while (num != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + (num % 10);
            num = num / 10;
        }
        return reverseNum;
    }
}
