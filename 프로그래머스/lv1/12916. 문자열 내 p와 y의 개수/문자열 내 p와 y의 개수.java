class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        char p = 0;
        char y = 0;
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'p'){
                p++;
            }else if(s.charAt(i) == 'y'){
                y++;
            }            
        }
           
        if(p == y) {
          return true;  
        } else {
          return false;  
        } 
    }
}