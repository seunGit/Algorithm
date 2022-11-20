class Solution {
    public long solution(int price, int money, int count) {
        long result = 0;
        long sum = 0;
        
        for (int i = 0; i <= count; i++) {
            sum += price * i;
         } 
        if(sum > money) { // 이거 진짜 짜증나네!!!!!!!!!!!!!!!!!!
        result = sum - money;
        }
        return result;
    }
}