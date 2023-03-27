def solution(weights):
    wd = {} # dict
    answer = 0

    for w in weights:
        if w in wd:
            wd[w] += 1
        else:
            wd[w] = 1
            
    for w in wd:
        if wd[w] > 1:
            answer += (wd[w] * (wd[w] - 1)) / 2
        if w * 2 in wd:
            answer += wd[w] * wd[2 * w]
        if w * 2 / 3 in wd:
            answer += wd[w] * wd[w * 2 / 3]
        if w * 3 / 4 in wd:
            answer += wd[w] * wd[w * 3 / 4]

    return answer