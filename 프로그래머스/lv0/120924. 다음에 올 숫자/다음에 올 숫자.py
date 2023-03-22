def solution(common):
    a = common[0]
    b = common[1]
    c = common[2]
    
    if (c-b == b-a):
        answer = common[-1]+(b-a)
    elif (c/b == b/a):
        answer = common[-1]*(b/a)
    return answer