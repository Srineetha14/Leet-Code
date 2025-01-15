class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0; // The square root of 0 is 0
        
        int left = 1, right = x, result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // To avoid overflow
            
            // Check if mid^2 is less than or equal to x
            if ((long)mid * mid <= x) {
                result = mid; // Update result as a potential answer
                left = mid + 1; // Move right to find a larger square root
            } else {
                right = mid - 1; // Move left to find a smaller square root
            }
        }
        
        return result; // Return the floor of the square root
    }
}
