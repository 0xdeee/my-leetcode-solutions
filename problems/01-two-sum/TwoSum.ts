/*
  instead of checking if nums[i] + nums[j] == target, we are taking an taking target - nums[i] and seeing the result value needed to complement it is already available in the map. the map lookup is constant time and if available we return or else add the current number to the map
*/
function twoSum(nums: number[], target: number): number[] {
  let map: Map<number, number> = new Map<number, number>();
  for (let i = 0; i < nums.length; i++) {
    let complement: number = target - nums[i];
    if (map.has(complement)) {
      return [map.get(complement), i];
    }
    map.set(nums[i], i);
  }
  throw new Error('no match found');
}

// time complexity: O(n)
// space complexity: O(n)
