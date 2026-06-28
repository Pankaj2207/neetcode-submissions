class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap= new HashMap();
        Map<Character, Integer> tMap = new HashMap();

        for (int i=0; i< s.length() ; i++) {
            Character currentChar = s.charAt(i);
            sMap.merge(currentChar, 1, (oldValue, newValue) -> oldValue + newValue);
        }

        for (int j=0; j< t.length() ; j++) {
            Character currentChar = t.charAt(j);
            tMap.merge(currentChar, 1, (oldValue, newValue) -> oldValue + newValue);
        }

        if(sMap.equals(tMap)) {
            return true;
        }

        return false;

    }
}
