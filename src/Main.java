public class Main {
    public static void main(String[] args) {
        int moneySpent = 500;
        if (moneySpent >= 20) {
            int miles = moneySpent / 20;
            System.out.println("Вам начислено " + miles + " миль");
        } else {
            System.out.println("Потратьте 20 рублей для получения бонусной мили.");
        }
    }
}
