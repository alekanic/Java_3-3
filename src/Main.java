public class Main {
    public static void main(String[] args) {
        double procent = 9.99;
        double sum = 1_000_000.0;
        double months = 12.0;

        CreditPaymentService service = new CreditPaymentService();
        int myPayment = service.calculate(sum, procent, months);
        System.out.println(myPayment);
        System.out.println();

        months = 24.0;
        CreditPaymentService serviceSecond = new CreditPaymentService();
        int myPaymentSecond = serviceSecond.calculate(sum, procent, months);
        System.out.println(myPaymentSecond);
        System.out.println();

        months = 36.0;
        CreditPaymentService serviceThird = new CreditPaymentService();
        int myPaymentThird = serviceThird.calculate(sum, procent, months);
        System.out.println(myPaymentThird);
    }
}
