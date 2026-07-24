class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = sumSquares(slow);
            fast = sumSquares(sumSquares(fast));
        } while (slow != fast);
        if (slow == 1)
            return true;
        else
            return false;
    }

    public int sumSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int dig = n % 10;
            sum += dig * dig;
            n /= 10;
        }
        return sum;
    }
}