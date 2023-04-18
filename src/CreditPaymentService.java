public class CreditPaymentService {

    public int calculate(double sum, double procent, double months) {
        double monthProcent = procent / 12 / 100.0;
        double payment = sum * ((monthProcent * Math.pow(1.0 + monthProcent, months)) / (Math.pow(1.0 + monthProcent, months) - 1.0));
        return (int) payment;
    }
}
