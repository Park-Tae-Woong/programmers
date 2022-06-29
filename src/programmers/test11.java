package programmers;
import java.util.*;

public class test11 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long[] answer = new long[n];
        for (int i = 0; i < n; i++){
            answer[i] = (long)(i+1) * x;
        }
        System.out.println(Arrays.toString(answer));
    }
}
