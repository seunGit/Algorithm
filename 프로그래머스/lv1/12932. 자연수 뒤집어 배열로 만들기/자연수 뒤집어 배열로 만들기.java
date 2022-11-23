class Solution {
  public int[] solution(long n) {
        String str = String.valueOf(n);
        StringBuilder sbr = new StringBuilder(str);
        sbr = sbr.reverse();
        String[] stringArr = sbr.toString().split("");
        int[] answer = new int[sbr.length()];
        for (int i=0; i < sbr.length(); i++) {
            answer[i] = Integer.parseInt(stringArr[i]);
        }
      
        return answer;
  }
}