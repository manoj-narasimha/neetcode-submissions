class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> hp = {};

        for (int i = 0; i < nums.size(); i++) {
            int needed = target - nums[i];
            if (hp.contains(needed)) {
                return {hp[needed], i};
            }
            hp.insert({nums[i], i});
        }

        return {-1, -1};
    }
};