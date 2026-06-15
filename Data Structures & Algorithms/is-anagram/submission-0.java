class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        char[] Sx = s.toCharArray();
        char[] Tx = t.toCharArray();

        Arrays.sort(Sx);
        Arrays.sort(Tx);

        return Arrays.equals(Sx,Tx);
    }
}
