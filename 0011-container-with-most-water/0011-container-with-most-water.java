class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int max = 0;
        
        while (low < high) {
            
            int width = high - low;
            int currentHeight = Math.min(height[low], height[high]);
            int result = width * currentHeight;
            
           
            max = Math.max(max, result);
            
            
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        
        return max;
    }
}