import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String result = "";
        for (char b : a.toCharArray()) {
            if (Character.isLowerCase(b)) {
                result += Character.toUpperCase(b);
            } else {
                result += Character.toLowerCase(b);
            }
        }
        System.out.println(result);
    }
}