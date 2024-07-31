import java.util.HashMap;
import java.util.Set;
public class Prob2_ValidAnagram {
    public static void main(String[] args) {
        String a = "hello";
        String b = "olleh";
        System.out.println(isAnagram(a,b));
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> st = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            st.put(ch, st.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            st.put(ch, st.getOrDefault(ch, 0) - 1);
            if (st.get(ch) == 0) {
                st.remove(ch);
            }
        }
            if (st.isEmpty())
                return true;
            else
                return false;
    }
}

