public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int price = 10_521;
        int cost = 20;
        int miles = service.calculate(price, cost);

        System.out.println("miles you have - " + miles);

    }
}