class Solution {
    public String solution(String phone_number) {
        String answer = phone_number.substring(0, phone_number.length()-4);
		String star = "";
        
		for(int i = 0; i < answer.length() ; i++) {
            star += "*";	
        }
			
	    return phone_number.replace(answer, star);
    }
}