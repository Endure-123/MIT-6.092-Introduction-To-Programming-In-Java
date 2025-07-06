package Assignment.Assignment2;

public class FooCorporation {
    public static void calculatePay(int worktime, double basePay) {

        double salary = 0;

        if (worktime > 60) {
            System.out.println("error");
            return;
        }

        if (basePay < 8.0) {
            System.out.println("error");
            return;
        }

        if (worktime <= 40) {
            salary = basePay * worktime;
        } else {
            salary = basePay * 40 + (worktime - 40) * basePay * 1.5;
        }

        System.out.println(salary);

    }

    public static void main(String[] args) {
        calculatePay(35, 7.5);
        calculatePay(47, 8.2);
        calculatePay(73, 10);

    }
}
