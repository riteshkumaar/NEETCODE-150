import java.util.HashMap;
public class Prob1_ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1,3,2,4 };
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // first Integer is the key and the second integer is the value
        int c = 0;
        map.put(nums[0],c);
        for(int i=1;i< nums.length;i++)
        {
            if(map.containsKey(nums[i]))
                return true;
            else
                map.put(nums[i],c);
        }
        return false;
    }
}
