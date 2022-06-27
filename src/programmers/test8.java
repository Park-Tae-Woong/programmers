package programmers;

public class test8 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,3,5,7};
        int sum = 0;
        for (int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println((double) sum/ arr.length);
    }
}
