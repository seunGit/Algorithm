def solution(strArr):
    return [strArr.lower() if i % 2 == 0 
            else strArr.upper() for i, strArr in enumerate(strArr)]