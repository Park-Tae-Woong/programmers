package programmers;

public class test3 {
    public static void main(String[] args) {
        String s = "abcde";
        String s2 = "fghi";
        if (s.length() % 2 == 0){
            System.out.println(s.substring(s.length()/2-1, s.length()/2+1));
        }else {
            System.out.println(s.substring(s.length()/2, s.length()/2+1));
        }
    }
}
