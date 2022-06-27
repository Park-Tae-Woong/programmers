package programmers;

public class test4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int sum = 0;
        if(a<b){
            for (int i = a; i<=b; i++){
                sum += i;
            }
        } else if (a>b) {
            for (int i = b; i<=a; i++){
                sum += i;
            }
        } else if (a==b) {
            sum = a;
        }

        System.out.println(sum);
    }
}
