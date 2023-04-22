import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] arr) {
    //  1. ===== StringBuffer 사용=====
    //     StringBuffer sb = new StringBuffer();
    //     for (String str : arr) {
    //         sb.append(str);
    //     } 
    //     return sb.toString();
    // }
        // 2. ===== 반복문 사용 =====
        // String answer = "";
        // for(int i = 0; i < arr.length; i++){
        //     answer += arr[i];
        // }
        // return answer;
        //
        // 3. ===== Stream 사용 =====
        return Arrays.stream(arr)
            .collect(Collectors.joining());

        }
}