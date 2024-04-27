import java.util.HashSet;

public class longestConsecutive {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int maxSeq = 1;
        for (int num : nums ) {
            hs.add(num);

        }
        for( int num: nums ){
            if( !hs.contains(num-1)){ // denoting start of my seq
                int currMaxSeq = 1;
                while( hs.contains(num+1)){// checking length of seq
                    num++;
                    currMaxSeq++;

                }
                maxSeq = Math.max(maxSeq,currMaxSeq );
            }
            if( maxSeq > nums.length/2) break;// for optimization kyuki agr maxSeq len/2 s jyda ho gya h to uss bda koi sequence in bn skta

        }
         return maxSeq;
    }
}
