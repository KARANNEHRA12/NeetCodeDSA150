package com.learn.dsa.twopointers;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums.length <3 || nums == null  ) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i =0; i< nums.length -1; i++){
             int left = nums[i +1];
             int right = nums.length-1;
             while(left< right){
                  int sum = nums[i]+ nums[left] + nums[right];
                  if( sum ==0 ) {
                      result.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                      while(left < right  &&  nums[left] == nums[left+1 ]){
                          left++;

                      }
                      while (left < right && nums[right ] == nums[right-1]){
                          right--;
                      }
                      left++;
                      right--;
                  }
                  else if( sum < 0){
                      left++;
                  }
                  else{
                      right--;
                  }
             }
        }
        return new ArrayList<>(result);
    }
}
