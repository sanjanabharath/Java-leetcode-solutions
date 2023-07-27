//https://leetcode.com/problems/powx-n/description/

class Solution {
    public double myPow(double x, int n) {
        long longN = n;
        double ans = solve(x, Math.abs(longN));

        if (longN < 0) {
            return 1 / ans;
        }
        return ans;
    }

    public double solve(double x, long n) {
        if (n == 0) {
            return 1; 
        }
        double temp = solve(x, n / 2);
        temp = temp * temp;

        if (n % 2 == 0) {
            return temp;
        } else {
            return temp * x;
        }
    }
}
