class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean a = true;
        if (ineq.equals(">") && eq.equals("=")) {
            a = n >= m;
        } else if (ineq.equals("<") && eq.equals("=")) {
            a = n <= m;
        } else if (ineq.equals(">") && eq.equals("!")) {
            a = n > m;
        } else if (ineq.equals("<") && eq.equals("!")) {
            a = n < m;
        }
        if (a == true) {
            return 1;
        } else {
            return 0;
        }
    }
}