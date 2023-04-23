class Solution {
    public int solution(int a, int b) {
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        int ab = Integer.parseInt(str1+str2);
        int ba = Integer.parseInt(str2+str1);
        
        if (ab >= ba) {
            return ab;
        } else {
            return ba;
        }
        
    }
}