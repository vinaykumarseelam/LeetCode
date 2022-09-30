class Solution {
    public int trap(int[] height) {
        int result = 0;
        int l = 0, r = height.length-1;
        int lw = 0, rw = 0; // heights of walls
        
        while (l <= r) {
            if (lw <= rw) { // process left side, because there is a right wall acting as dam
                if (height[l] < lw) { // can trap water
                    result += (lw - height[l]);
                } else {
                    lw = height[l];
                }
                l++;
            } else { // process right side, because there is a left wall acting as dam
                if (height[r] < rw) { // can trap water
                    result += (rw - height[r]);
                } else {
                    rw = height[r];
                }
                r--;
            }
        }
        
        return result;
    }
}