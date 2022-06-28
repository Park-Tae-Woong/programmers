package programmers;
import java.util.*;

public class test23 {
    public static void main(String[] args) {
        long n = 1524983;
        String s = Long.toString(n); //long -> str
        int[] answer = new int[s.length()];
        int count = 0;
        while (n > 0){
            answer[count] = (int)(n%10);
            n /= 10;
            count++;
        }
        System.out.println(answer);
    }
}
