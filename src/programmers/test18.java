package programmers;
import java.util.*;

public class test18 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        for (int i = 0; i < seoul.length; i++){
            if (seoul[i].equals("Kim")){
                System.out.println("김서방은 " + i + "에 있다.");
            }
        }
    }
}
