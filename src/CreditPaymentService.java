public class CreditPaymentService {

    public int calculate(int sum, double procent, int months) {
        double payment = sum * ((procent * Math.pow(1 + procent, months)) / (Math.pow(1 + procent, months) - 1));
        return (int) payment;
    }
}
