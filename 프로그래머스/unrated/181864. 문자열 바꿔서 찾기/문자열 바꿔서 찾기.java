import java.util.Arrays;

class Solution {
    public int solution(String myString, String pat) {
        StringBuffer sb = new StringBuffer();
        for (char ch : myString.toCharArray())
            if (ch == 'A') sb.append('B');
            else sb.append('A');
        return sb.toString().contains(pat) ? 1 : 0;
    }
}