package Bus;

import java.util.Scanner;

public class Bus {
    int maxPassenger = 45;
    int nowPassenger = 0;
    int passenger;
    int fare = 1200;
    int busNumber;
    int fuel;
    int nowSpeed;
    int changeSpeed;
    boolean race;
    Scanner s = new Scanner(System.in);

    public Bus(int busNumber){
        this.busNumber = busNumber;
        System.out.println("버스 번호는 " + busNumber + "입니다. "+"요금은 " + this.fare + "원 입니다.");
    }

    public boolean Race(){
        this.race = true;
        System.out.print("주유량을 입력하세요 : ");
        this.fuel = s.nextInt();
        if (fuel <= 10) {
            System.out.println("주유가 필요합니다.");
            race = false;
        }else {
            System.out.println("운행을 시작합니다.");
        }
        return race;
    }

    public int OriginSpeed(int nowSpeed){
        if (this.race == true) {
            this.nowSpeed = nowSpeed;
            System.out.println("현재 속도 : " + nowSpeed);
        }
        return nowSpeed;
    }
    public int RidePassenger(){
        if (this.race == true){
            System.out.print("탑승 인원 수를 입력하세요 : ");
            this.passenger = s.nextInt();
            if (this.passenger <= this.maxPassenger) {
                System.out.println("탑승 완료!");
                this.nowPassenger += this.passenger;
            } else if (this.nowPassenger + this.passenger > this.maxPassenger){
                System.out.println("정원을 초과하였습니다.");
                this.race = false;
            }
        }return this.passenger;
    }

    public int ChangeSpeed(int changeSpeed){
        if (this.race == true) {
            this.changeSpeed = changeSpeed;
            if (changeSpeed > this.nowSpeed) {
                System.out.println("속도를 올립니다. 현재 속도 : " + changeSpeed);
            } else if (changeSpeed == this.nowSpeed) {
                System.out.println("변경할려는 속도가 같습니다.");
            } else {
                System.out.println("속도를 낮춥니다. 현재 속도 : " + changeSpeed);
            }
        }
        return changeSpeed;

    }

    public static void main(String[] args) {
        Bus bus = new Bus(1000); //버스 번호 입력 필요
        bus.Race();
        bus.OriginSpeed(10); //운행 속도 입력 필요
        bus.RidePassenger();
        bus.ChangeSpeed(1); //바꿀 속도 입력 필요
    }
}
