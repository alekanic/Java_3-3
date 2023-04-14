public class Main {
    public static void main(String[] args) {
        double procent = 9.99;
        int sum = 1_000_000;
        int months = 12;

        CreditPaymentService service = new CreditPaymentService();
        double myPayment = service.calculate(sum, procent, months);
        System.out.println(myPayment);
        System.out.println();

        int monthsSecond = 24;
        CreditPaymentService serviceSecond = new CreditPaymentService();
        double myPaymentSecond = serviceSecond.calculate(sum, procent, monthsSecond);
        System.out.println(myPaymentSecond);
        System.out.println();

        int monthsThird = 36;
        CreditPaymentService serviceThird = new CreditPaymentService();
        double myPaymentThird = serviceThird.calculate(sum, procent, monthsThird);
        System.out.println(myPaymentThird);
    }
}
