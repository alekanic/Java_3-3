public class Main {
    public static void main(String[] args) {
        double procent = 9.99;
        int sum = 1_000_000;
        int months = 24;

        double month_procent = procent / months / 100;

        CreditPaymentService service = new CreditPaymentService();
        double my_payment = service.calculate(sum, month_procent, months);
        System.out.println(my_payment);
    }
}
