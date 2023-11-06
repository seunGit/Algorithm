function solution(n) {
    var answer = [];
    var sum = 0;
    for (let i = 1; i <= n; i++) {
        if (i % 2 === 0) {
            answer.push(i)
            sum += i;
        }
    }
    return sum;
}