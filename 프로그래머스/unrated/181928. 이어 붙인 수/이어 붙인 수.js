function solution(num_list) {
    var odd = "";
    var even = "";
    for (num of num_list) {
        if (num % 2 === 0) {
            even += num.toString()
        } else {
            odd  += num.toString()
        }
    }
    return Number(even) + Number(odd);
}