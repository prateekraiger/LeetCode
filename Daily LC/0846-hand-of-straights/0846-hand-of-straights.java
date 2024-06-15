import java.util.TreeMap;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> cc = new TreeMap<>();
        for (int card : hand) {
            cc.put(card, cc.getOrDefault(card, 0) + 1);
        }
        while (cc.size() > 0) {
            int firstCard = cc.firstKey();
            for (int card = firstCard; card < firstCard + groupSize; card++) {
                if (!cc.containsKey(card)) {
                    return false;
                }
                int count = cc.get(card);
                if (count == 1) {
                    cc.remove(card);
                } else {
                    cc.put(card, count - 1);
                }
            }
        }
        return true;
    }
}
