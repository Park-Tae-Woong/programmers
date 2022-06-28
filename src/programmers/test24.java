package programmers;

import java.util.*;

public class test24 {
    public static void main(String[] args) {
        long n = 382943;
        String answer = "";
        String s = String.valueOf(n);
        String[] arr = s.split("");
        Arrays.sort(arr,Collections.reverseOrder());
        for (int i = 0; i< arr.length; i++){
            answer += arr[i];
        }
        long l = Long.parseLong(answer);
        System.out.println(l);
    }
}