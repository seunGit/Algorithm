class Solution {
    public boolean solution(String s) {
        if ((s.length() == 4 || s.length() == 6) && s.matches("[0-9]+")) {
            return true;
        }
        else {
            return false;
        }
    }
}         // s의 길이가 4 또는 6이고, 숫자로만 구성되어 있다면 true, 아니면 false.