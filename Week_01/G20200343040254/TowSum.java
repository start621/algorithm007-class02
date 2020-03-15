/**
 * 
 */
package app.foundation.common.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jarod.xu
 *
 */
public class TowSum {
	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> hash = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int c = target - nums[i];
			if (hash.containsKey(c)) {
				return new int[] { hash.get(c), i };
			}

			hash.put(nums[i], i);
		}

		return new int[0];
	}
}
