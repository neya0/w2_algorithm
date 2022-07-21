public class Taxi extends PublicTraffic{

    int price;
    int miterPerPrice;
    int distance;
    int distForDestination;
    String destination;
    int totalRevenues;

    public Taxi(int maxPassenger, String stateMsg) {
        super(maxPassenger, stateMsg);
        this.price = 3000;
        this.miterPerPrice = 1000;
        this.distance = 1;
        this.distForDestination = 0;
        this.destination = "";
        this.totalRevenues = 0;
    }

    //승객 탑승
    public  void inPassenger (int number, String destination, int distance) {
        //최대 승객수 초과
        if ((this.maxPassenger - this.presentPassenger) < number) {
            System.out.println("최대 승객수 초과");
        } else {
            getPassenger(number);
            this.totalPrice += this.price + (this.miterPerPrice * (distance - this.distance));
            this.destination = destination;
            this.distForDestination = distance;
            this.stateMsg = "운행중";
        }
    }

    //승객 하차 및 요금 결재
    public void getOutPassenger(int money){
        this.totalRevenues += money;
        outPassenger();
        this.destination = "";
        this.distForDestination = 0;
        this.stateMsg = "일반";
        checkForRun();
        if(this.state == false){
            this.stateMsg = "운행불가";
        }
    }

    //오일 상태변경
    public void checkOil(int oil){
        serveOil(oil);
        outPassenger();
        if(this.state == false){
            this.stateMsg = "운행불가";
        }
    }

    public void taxiInfo(){
        info();
        System.out.println("기본요금 확인 =" + this.price + "원");
        System.out.println("목적지 =" + this.destination);
        System.out.println("목적지까지 거리 =" + this.distForDestination + "Km");
        System.out.println("지불 요금 확인 = " + this.totalPrice + "원");
        System.out.println("주유량 = " + this.oil);
        System.out.println("상태 = " + this.stateMsg);
        System.out.println("누적 매출 확인 = " + this.totalRevenues + "원");

    }

    public static void main(String[] args) {
        Taxi taxi1 = new Taxi( 4, "일반");
        Taxi taxi2 = new Taxi(4, "일반");

        taxi1.checkNumber(taxi1.number, taxi2.number);
        System.out.println("-------------");
        taxi1.inPassenger(2, "서울역", 2);
        taxi1.taxiInfo();
        System.out.println("-------------");
        taxi1.checkOil(-80);
        taxi1.getOutPassenger(4000);
        taxi1.taxiInfo();
        System.out.println("-------------");
        taxi1.inPassenger(5, "", 0);
        taxi1.taxiInfo();
        System.out.println("-------------");
        taxi1.inPassenger(3, "구로디지털단역", 12);
        taxi1.taxiInfo();
        System.out.println("-------------");
        taxi1.checkOil(-20);
        taxi1.getOutPassenger(14000);
        taxi1.taxiInfo();
    }
}
