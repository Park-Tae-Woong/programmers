package programmers;

public class test7 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        boolean[] arr2 = {true, true, false};
        int sum = 0;
        for (int i =0; i<arr2.length; i++){
            if(arr2[i]){
                sum += arr1[i];
            }else {
                sum -= arr1[i];
            }
        }
        System.out.println(sum);
    }
}
