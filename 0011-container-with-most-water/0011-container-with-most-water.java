class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            // Container ki width aur minimum height calculate karein
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            
            // Current area nikaalein aur maxWater update karein
            int currentWater = width * minHeight;
            maxWater = Math.max(maxWater, currentWater);

            // Chhoti line wale pointer ko aage badhayein
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}