package com.learn.dsa.twopointers;

public class TrappingRainWater {
    public int trap(int[] height) {
        int left=0;
        int ans =0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = height[right];
        while (left < right){
            if( leftMax < rightMax){
                left++;
                leftMax= Math.max(leftMax, height[left]);
                ans += leftMax - height[left];

            }
            else{
                right--;
                rightMax = Math.max(rightMax, height[right]);
                ans += rightMax - height[right];

            }
        }

    return ans;

    }
}
