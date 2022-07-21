public class Bus extends PublicTraffic {

    int price;

    public Bus(int maxPassenger, String stateMsg) {
        super(maxPassenger, stateMsg);
        this.price = 1000;

    }

    // 승객탑승 시 요금계산
    public  void payingBus (int number){
        //최대 승객수 초과
        if((this.maxPassenger - this.presentPassenger) < number){
            System.out.println("최대 승객수 초과");
        } else{
            getPassenger(number);
            this.totalPrice = this.price * number;
        }
    }

    //버스 상태변경 및 승객 하차
    public void changeState(String status){
        if(status == "차고지행"){
            this.stateMsg = "차고지행";
            this.state = false;
            outPassenger();
        }else if(status == "운행중"){
            this.stateMsg = "운행중";
            this.state = true;
        }
    }

    //오일 상태변경
    public void getOil(int oil){
        serveOil(oil);
        this.stateMsg = "차고지행";
        outPassenger();
    }

    public void busInfo(){
        info();
        System.out.println("요금 확인 = " + this.totalPrice);
        System.out.println("주유량 = " + this.oil);
        System.out.println("상태 = " + this.stateMsg);
    }


   public static void main(String[] args) {
        Bus bus1 = new Bus( 30, "운행");
        Bus bus2 = new Bus(30, "운행");

        bus1.checkNumber(bus1.number, bus2.number);
        System.out.println("-------------");
        bus1.payingBus(2);
        bus1.busInfo();
        System.out.println("-------------");
        bus1.getOil(-50);
        bus1.busInfo();
        System.out.println("-------------");
        bus1.changeState("차고지행");
        bus1.busInfo();
        System.out.println("-------------");
        bus1.getOil(10);
        bus1.busInfo();
        System.out.println("-------------");
        bus1.changeState("운행중");
        bus1.busInfo();
        System.out.println("-------------");
        bus1.payingBus(45);
        bus1.busInfo();
        System.out.println("-------------");
        bus1.payingBus(5);
        bus1.busInfo();
        System.out.println("-------------");
        bus1.getOil(-55);
        bus1.busInfo();
    }
}
