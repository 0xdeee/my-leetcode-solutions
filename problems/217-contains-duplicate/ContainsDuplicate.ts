/*
- adding all the elements of array to a Set
- compare if the size of set & size of array are unequal.
*/
function containsDuplicate(nums: number[]): boolean {
  return new Set(nums).size != nums.length;
}
