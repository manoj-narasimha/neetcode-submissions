class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (Integer x: nums) {
            if (freq.containsKey(x)) {
                freq.put(x, freq.get(x) + 1);
            } else {
                freq.put(x, 1);
            }
        }

        List<Integer> numbers = new ArrayList<>(freq.keySet());

        Collections.sort(numbers, (a,b) -> {
            return freq.get(b) - freq.get(a);
        });

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = numbers.get(i);
        }

        return result;
    }
}