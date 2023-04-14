public class CreditPaymentService {

    public int calculate(int sum, double procent, int months) {
        double monthProcent = procent / months / 100;
        double payment = sum * ((monthProcent * Math.pow(1 + monthProcent, months)) / (Math.pow(1 + monthProcent, months) - 1));
        return (int) payment;
    }
}
