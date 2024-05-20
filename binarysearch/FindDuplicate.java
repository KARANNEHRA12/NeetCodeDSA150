package com.learn.dsa.binarysearch;

public class FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while( slow != fast);
        int slow2 =0;
        do {
            slow= nums[slow];
            slow2 = nums[slow2];
        }
        while( slow != slow2);
        return slow2;

    }
}
