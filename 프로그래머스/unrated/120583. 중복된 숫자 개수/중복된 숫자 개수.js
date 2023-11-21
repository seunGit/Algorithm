function solution(array, n) {
    var answer = 0;
    let result = array.filter((value) => value === n )
    return result.length;
}