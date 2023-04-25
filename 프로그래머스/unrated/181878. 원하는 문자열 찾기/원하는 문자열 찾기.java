class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String mystr = myString.toLowerCase();
        String p = pat.toLowerCase();
        if (myString.length() < pat.length()) {
            answer = 0;
        }
        if (mystr.contains(p)) {
            answer = 1;
        }
        return answer;
    }
}