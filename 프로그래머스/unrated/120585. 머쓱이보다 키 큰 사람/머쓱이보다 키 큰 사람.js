function solution(array, height) {
    var answer = 0;
    var count = 0;
    array.forEach((value) => {
        if (value > height) {
            answer = ++count;
        }
    })
    return answer;
}