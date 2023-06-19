function solution(a, d, included) {
    var answer = 0
    for(var i = 0; i<included.length; i++){
        if(included[i] === true) {
            if(i === 0) answer += a
            else answer += a + (i * d)
        }
    }
    return answer
}