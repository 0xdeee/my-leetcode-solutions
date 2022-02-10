class Solution {
  // constant space complexity but quadratic time complexity
  public int[] twoSum(int[] nums, int target) {
      for (int i = 0;  i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
          if ((nums[i] + nums[j]) == target) {
            return new int[] {i, j};
          }
        }
      }
    throw new IllegalArgumentException("No match found");
  }
  
  // linear time complexity but also linear space complexity (space grows as more are added to the HashMap) 
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    /*
      instead of checking if nums[i] + nums[j] == target, we are taking an taking target - nums[i] and
      seeing the result value needed to complement it is already available in the map. 
      the map lookup is constant time and if available we return or else add the current number to the map
    */
    for(int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if(map.containsKey(complement)) {
        return new int[] {map.get(complement), i};
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No match found");
  }
}
