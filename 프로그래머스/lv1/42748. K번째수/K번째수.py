def solution(array, commands):
    answer = []
    
    for i, j, k in commands:
        arr = array[i-1:j] # i-1번째부터 j번째까지 자른다.
        arr.sort() # 정렬
        answer.append(arr[k-1]) # k-1번째의 숫자를 하나씩 더한다.
    return answer