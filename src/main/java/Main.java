public class Main {
    public static void main(String[] args) {
        BonusService bonusService=new BonusService();
        System.out.println(bonusService.calculate(1000_60,true));
    }
}
