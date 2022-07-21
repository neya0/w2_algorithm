import java.util.UUID;

public class PublicTraffic {

    String number;
    int oil;
    int speed;
    int maxPassenger;
    boolean state;
    String stateMsg;
    int presentPassenger;
    int totalPrice;

    public PublicTraffic(int maxPassenger, String stateMsg) {
        this.number = makeNumber();
        this.oil = 100;
        this.speed = 0;
        this.maxPassenger = maxPassenger;
        this.state = false;
        this.stateMsg = stateMsg;
        this.presentPassenger = 0;
        this.totalPrice = 0;
    }

    // 고유값 생성
    public String makeNumber(){
        String randomNumber = UUID.randomUUID().toString();
        return randomNumber;
    }

    // number 확인
    public void checkNumber(String number1, String number2){
        if(number1.equals(number2)){
            System.out.println("번호가 같습니다.");
        }else{
            System.out.println("번호가 다릅니다.");
            checkForRun();
            this.state = true;
            System.out.println("상태 = " + this.stateMsg);
        }
    }

    //운행 가능 상태 확인
    public void checkForRun(){
        if(this.oil <= 10){
            this.state = false;
            System.out.println("****WARNING****");
            System.out.println("주유 필요: 운행 불가");
            System.out.println("***************");
        }
    }

    // 승객 탑승
    public void getPassenger (int number){
        if(this.state == true && number > 0) {
            this.presentPassenger += number;
            this.maxPassenger -= this.presentPassenger;
        }
    }

    //속도 변경
    public void changeSpeed(int speed){
        this.speed += speed;
        System.out.println("현재 속도 = " + this.speed);
    }

    //승객 하차
    public void outPassenger(){
        this.maxPassenger += this.presentPassenger;
        this.presentPassenger = 0;
        this.totalPrice = 0;
    }

    //오일
    public void serveOil(int oil){
        this.oil += oil;
        checkForRun();
    }


    //현 상태
    public void info(){
        System.out.println("탑승 승객 수 = " + this.presentPassenger);
        System.out.println("잔여 자리 수 = " + this.maxPassenger);
    }




}
