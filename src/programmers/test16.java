package programmers;
import java.util.*;

public class test16 {
    public static void main(String[] args) {
        boolean answer = true;
        String s = "ppyy";
        int p = 0;
        int y = 0;

        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                p++;
            }
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                y++;
            }
        }
        if (p == y){
            answer = true;
        } else {
            answer = false;
        }

        System.out.println(answer);
    }
}
