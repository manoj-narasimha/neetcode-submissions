class Solution {
public:
    bool isAnagram(string s, string t) {
        int s_len = s.size();
        int t_len = t.size();
        if (s_len != t_len) {
            return false;
        }

        sort(s.begin(), s.end());
        sort(t.begin(), t.end());

        return s == t;
    }
};
