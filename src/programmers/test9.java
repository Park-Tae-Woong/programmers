package programmers;

public class test9 {
    public static void main(String[] args) {
        String s = "01042845560";
        String answer = "";
        for(int i = 0; i<s.length(); i++){
            if (i < s.length()-4){
                answer += "*";
            } else {
                answer += s.charAt(i);
            }
        }System.out.println(answer);
    }
}
