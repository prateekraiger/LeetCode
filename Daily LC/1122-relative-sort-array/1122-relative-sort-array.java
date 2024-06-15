import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr1)
            map.put(num, map.getOrDefault(num, 0) + 1);
        
        int i = 0;
        for (int num : arr2) {
            for (int j = 0; j < map.get(num); j++)
                arr1[i++] = num;
            map.remove(num);
        }
        
        int j = i;
        for (int num : map.keySet()) {
            for (int k = 0; k < map.get(num); k++)
                arr1[j++] = num;
        }
        
        Arrays.sort(arr1, i, arr1.length);
        return arr1;
    }
}
