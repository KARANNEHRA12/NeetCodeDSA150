import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    class Pair implements Comparable<Pair> {
        int val;
        int idx;

        Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair o){
            return  this.val - o.val;
        }



    }
//    public int[] twoSum(int[] nums, int target) {
//        int [] res = new int[2];
//        Pair[] pair= new Pair[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            pair[i] = new Pair(nums[i],i );
//
//        }
//        Arrays.sort(pair);
//        int li =0;
//        int ri = nums.length -1;
//        while (li < ri){
//            int left = pair[li].val;
//            int right = pair[ri].val;
//            if( left + right > target){
//                ri--;
//
//            }
//            else if( left + right < target){
//                li++;
//
//            }
//            else{
//                res[0] = pair[li].idx;
//                res[1] = pair[ri].idx;
//                break;
//
//            }
//        }
//        return res;
//
//    }

    public int[] teoSum( int [] nums, int target){
        HashMap<Integer,Integer> prevVal = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if( prevVal.containsKey(diff)){
                return  new int[] {prevVal.get(diff) ,i};

            }
            prevVal.put(num,i);

        }
        return new int[]{};
    }
}
