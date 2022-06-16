package algorithms;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
	
    // Given an array of integers nums and an integer target, return indices of the two numbers such that
    // they add up to target.
    //
    //You may assume that each input would have exactly one solution,
    // and you may not use the same element twice.
    //
    //You can return the answer in any order.

	public static void main(String[] args) {
		int[] nums = {2,3,4,5};
		int target = 5;
		int[] twosum = twoSum(nums, target);
		for(int i=0; i<2; i++) {
			System.out.println(twosum[i]);
		}

	}
	
	
	
	public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int complement = target - num1;

            if (map.containsKey(complement) && i != map.get(complement)) {
                int indexOfNum2 = map.get(complement);
                return new int[]{i, indexOfNum2};
            }
        }
        return new int[] {0,0};
    }
	
	

}
