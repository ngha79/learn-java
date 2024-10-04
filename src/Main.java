public class Main {

    public boolean isHappy(int num) {
        int slow = num;
        int fast = num;

        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

        return slow == 1;
    }

    public int square(int num) {
        int ans = 0;
        while (num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        boolean isHappy = new Main().isHappy(2);
        System.out.println(isHappy);
    }

}