class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String str: strs) {
            encoded.append(str.length());

            encoded.append("#");

            encoded.append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find the '#'
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            // Get the length
            int length = Integer.parseInt(str.substring(i, j));

            // Move past '#'
            j++;

            // Extract the actual string
            String word = str.substring(j, j + length);

            result.add(word);

            // Move to the beginning of the next encoded string
            i = j + length;
        }

        return result;
    }
}
