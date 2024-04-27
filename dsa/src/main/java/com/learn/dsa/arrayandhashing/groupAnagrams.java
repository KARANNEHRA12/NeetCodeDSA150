import java.util.*;

public class groupAnagrams {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> ans = new ArrayList<>();
//        HashMap<HashMap<Character, Integer> , ArrayList<String>> bMap = new HashMap<>();
//
//        for (String str : strs){
//            HashMap<Character,Integer> FreqMap = new HashMap<>();
//            for( int i =0; i < str.length();i++){
//                char ch = str.charAt(i);
//                FreqMap.put(ch, FreqMap.getOrDefault(ch, 0) +1) ;
//            }
//
//            if( !bMap.containsKey(FreqMap)){
//                ArrayList<String> list=  new ArrayList<>();
//                list.add(str);
//                bMap.put(FreqMap, list);
//            }
//            else {
//                ArrayList<String> list =  bMap.get(FreqMap);
//                list.add(str);
//
//            }
//        }
//        for (ArrayList<String> val : bMap.values()){
//            ans.add(val);
//
//        }
//
//        return ans;
//    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for( String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);

            if( !map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
