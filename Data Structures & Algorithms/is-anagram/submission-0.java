class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        String[] str = new String[s.length()];
        String[] str1 = new String[t.length()];
        for (int i = 0; i < s.length(); i++) {
            str[i] = String.valueOf(s.toCharArray()[i]);
            str1[i] = String.valueOf(t.toCharArray()[i]);
        }
        Arrays.sort(str);
        Arrays.sort(str1);
        for (int i = 0; i < str.length; i++) {
            if(!str[i].equalsIgnoreCase(str1[i])) {
                return false;
            }
        }
        return true;
    }
}
