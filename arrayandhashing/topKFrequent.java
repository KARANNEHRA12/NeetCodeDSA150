import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class topKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        int [] ans = new int[k];
        List<Integer> [] bucket = new List[nums.length +1];
        HashMap<Integer, Integer> countFreq = new HashMap<>();

        for( int num: nums){
             countFreq.put(num, countFreq.getOrDefault( num, 0) +1);
        }
        for( int key : countFreq.keySet()){
            int frequency = countFreq.get(key);
            if( bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> topKelements = new ArrayList<>();
        for( int pos = bucket.length -1 ; pos >=0 && topKelements.size() <k ;pos--){
            if( bucket[pos] != null){
                topKelements.addAll(bucket[pos]);
            }
        }
         return topKelements.stream().mapToInt(Integer::intValue).toArray();

    }
}
