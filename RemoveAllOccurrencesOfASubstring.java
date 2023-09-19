class Solution {
    public String removeOccurrences(String s, String part) {
        if(!s.contains(part)){
            return s;
        }

        int removePartIndex = s.indexOf(part);
        return removeOccurrences(s.substring(0,removePartIndex) + s.substring(removePartIndex + part.length()),part);
    }
}
