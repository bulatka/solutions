class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            if (j == 0) {
                return "";
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{}));
        System.out.println(new Solution().longestCommonPrefix(new String[]{"armageddon"}));
        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(new Solution().longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}