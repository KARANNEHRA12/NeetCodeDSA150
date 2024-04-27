public class productExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int [] ans = new int[nums.length];
        int right =1 , left = 1;
        for (int i = 0; i < ans.length ; i++) {
            ans[i] = left;
            left *= nums[i];

        }
        for (int i = ans.length -1;  i >=0 ; i--) {
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }
}
