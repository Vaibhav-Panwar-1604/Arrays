public class PalindromeNumber {
    static boolean checkPalindrome(int n) {
        int sum = 0, target = n;
        while (n > 0) {
            int temp = n % 10;
            n = n / 10;
            sum = (sum * 10) + temp;
        }
        return target == sum;
    }

    public static void main(String[] args) {

        int n = 12321;
        System.out.println(checkPalindrome(n));

    }
}
