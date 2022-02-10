class ContainsDuplicate {
  /*
  - adding all the elements of array to a Set
  - compare if the size of set & size of array are unequal.
  */
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for(int num: nums) set.add(num);
    return set.size() != nums.length;
  }
}