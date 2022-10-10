package programmers;

public class jari {
    public static void main(String[] args) {
        int samDaily = 3;
        int kellyDaily = 5;
        int difference = 1;
        System.out.println(solution(samDaily, kellyDaily, difference));
    }

    public static int solution(int samDaily, int kellyDaily, int difference) {
        int samSolved = samDaily + difference; //4 7 10
        int kellySolved = kellyDaily; //5 10 15 8
        int day = 1;

        while (0 <= samSolved){

            if(kellySolved > samSolved){
                return day;
            }
            samSolved += samDaily;
            kellySolved += kellyDaily;
            day ++;

            if (samDaily == kellyDaily) {
                return day = -1;
            }
        }
        return day;
    }
}
