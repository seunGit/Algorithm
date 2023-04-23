class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        int ab2 = 2 * a * b;
        int ab = Integer.parseInt(str1+ str2);
        
        if (ab >= ab2) {
            return ab;
        } else {
            return ab2;
        }
    }
}