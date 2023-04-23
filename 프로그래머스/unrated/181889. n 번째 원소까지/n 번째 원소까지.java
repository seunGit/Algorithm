import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n); // (복사할배열, 몇번째부터, 배열크기)
    }
}