import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i : nums) {
            if( numSet.contains(i)){
                return  true;
            }
            numSet.add(i);

        }
        return false;


    }
}
