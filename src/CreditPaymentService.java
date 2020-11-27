public class CreditPaymentService {
    public double calculate(double creditAmount, double ratePercent, double creditPeriod) {

        double monthPercent = ratePercent / 12;
        double monthPayment = creditAmount * monthPercent / (1 - Math.pow(1 + monthPercent, -creditPeriod));

        return monthPayment;
    }
}
