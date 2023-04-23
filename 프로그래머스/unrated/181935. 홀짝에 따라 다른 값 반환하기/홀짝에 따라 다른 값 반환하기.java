class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0) { // n이 짝수이면
            for (int i = 2; i <= n; i += 2)   // 반복문, 2부터 시작해서 2씩 올리면서 반복문 실행 
                answer += i * i;    // 짝수값num 제곱 합 계산
        } else {
            for (int i = 1; i <= n; i += 2)   // 반복문, 1부터 시작해서 2씩 올리면서 반복문 실행
                answer += i; // 홀수 값 하니씩 더하기
        }
        return answer;
    }
}