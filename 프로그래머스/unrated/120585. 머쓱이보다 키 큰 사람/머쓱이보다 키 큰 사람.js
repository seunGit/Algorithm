function solution(array, height) {
    // filter 적용해보기
   var answer = array.filter(value => value > height);
    return answer.length;
}