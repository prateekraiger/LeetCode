class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // add empty list

        // recursive function to generate all subsets
        generateSubsets(nums, 0, new ArrayList<>(), result);

        return result;
    }

    // recursive function to generate all subsets
    private void generateSubsets(int[] nums, int start, List<Integer> current,List<List<Integer>> result) {
        for (int i = start; i < nums.length; i++) {
            // create a new list from current list and add current element
            List<Integer> newList = new ArrayList<>(current);
            newList.add(nums[i]);
            result.add(newList); // add new list to result
            generateSubsets(nums, i + 1, newList, result); // recursive call
        }
    }
}