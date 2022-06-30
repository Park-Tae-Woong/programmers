package programmers;

public class test12 {
    public static void main(String[] args) {
        long answer = -1;
        int price = 3;
        int count = 4;
        int money = 20;
        long sum = 0;

        for(int i = 1; i <= count; i++){
            sum += price * i;
        }
        System.out.println(sum);

        if (sum > money){
            answer = sum - money;
        }else {
            answer = 0;
        }
        System.out.println(answer);

    }
}
