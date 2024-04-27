import java.util.HashMap;

public class Anagram {
    public boolean isAnagram(String s, String t) {
//        HashMap<Character, Integer> charCount = new HashMap<>();
        if( s.length() != t.length())
             return false;

        int [] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;


        }
        for( int j : charCount){
            if( j != 0)
                return false;
        }
        return true;
    }
}
