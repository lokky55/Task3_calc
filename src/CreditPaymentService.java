public class CreditPaymentService {
    public double calculate(int summ, int years, double percent) {
        int months = years * 12;
        double intRate = percent / (100 * 12);
        double fraction = intRate / (1 - (Math.pow(1 + intRate, -months)));
        double monthPayment = summ * fraction;
        return monthPayment;
    }
}
