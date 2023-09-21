import java.util.*;
class Solution {

    static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||
        ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }

    public String reverseVowels(String s) {

        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }

        Collections.reverse(list);
        int j = 0;
        String result = "";

        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                result += list.get(j);
                j++;
            }
            else{
                result += s.charAt(i);
            }
        }

        return result;
    }
}
