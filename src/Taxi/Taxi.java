package Taxi;
import java.util.Scanner;

public class Taxi {
    int number;
    int fuel;
    int nowSpeed;
    int changeSpeed;
    String destination;
    int basicDistance = 2000;
    int distance;
    int baseRate = 2000;
    int changeRate = 100; // 100m당 100원
    int totalRate;
    int passenger = 0;
    boolean race;

    public Taxi(int number) {
        this.number = number;
        System.out.println("택시 번호는 " + number + "입니다. 기본 요금은 " + this.baseRate + "원 입니다.");
    }

    public boolean nowFuel() {
        this.race = true;
        System.out.print("주유량을 입력하세요 : ");
        Scanner s = new Scanner(System.in);
        this.fuel = s.nextInt();
        if (fuel <= 10) {
            System.out.println("주유가 필요합니다.");
            race = false;
        } else {
            System.out.println("운행을 시작합니다.");
        }
        return race;
    }

    public boolean Riding(int passenger) {
        if (this.race == true){
            Scanner s = new Scanner(System.in);
            this.passenger = passenger;
            System.out.print("탑승하려면 0을 입력, 나머지 수 탑승불가 : ");
            passenger = s.nextInt();
            if(passenger == 0){
                System.out.println("탑승 완료!");
                this.race = true;
            }else{
                System.out.println("탑승 불가!");
                this.race = false;
            }
        }
        return race;
    }

    public void Arrive(){
        if (this.race == true) {
            Scanner s = new Scanner(System.in);
            System.out.print("목적지를 입력하세요 : ");
            this.destination = s.nextLine();
            System.out.println(this.destination + "로 출발합니다.");
        }
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

    public void Last(int distance){
        this.distance = distance;
        if (this.race == true) {
            if(this.basicDistance >= distance){
                System.out.println("기본 요금 "+ this.baseRate +"원 입니다.");
            }else {
                distance = distance - this.basicDistance;
                this.totalRate = this.baseRate + (distance/100) * this.changeRate;
                System.out.println("총 요금 "+ this.totalRate + "원 입니다.");
            }
        }
    }



    public static void main(String[] args) {
        Taxi taxi = new Taxi(4949);
        taxi.nowFuel();
        taxi.Riding(0);
        taxi.Arrive();
        taxi.ChangeSpeed(50); //속도 입력
        taxi.Last(5000); //거리 입력
    }
}

