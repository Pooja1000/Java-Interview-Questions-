// addition of 2 number should be equal to target value

import java.util.HashMap;

public class hashmap {

    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                int[] result = {map.get(complement), i};
                return result;
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;

        int[] result = findTwoSum(nums, target);

        if (result != null) {
            System.out.println("Positions of the two numbers: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found with the given target.");
        }
    }
}
