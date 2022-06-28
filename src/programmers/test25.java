package programmers;

public class test25 {
    public static void main(String[] args) {
        long n = 144;
        int answer = 0;
        for (long i = 1 ; i <= n; i++){
            if(i * i == n){
                answer = (int)((i+1)*(i+1));
                break;
            }else{
                answer = -1;
            }
        }
        System.out.println(answer);
    }
}
