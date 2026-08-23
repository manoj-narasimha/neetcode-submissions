class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> hs = {};

        for (int x : nums) {
            if (hs.contains(x)) {
                return true;
            }
            hs.insert(x);
        }

        return false;
    }
};