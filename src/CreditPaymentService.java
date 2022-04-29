public class CreditPaymentService {
    public double calculate(int summ, int years, float percent) {
        int months = years * 12;
        double monthPayment = summ * ((percent / (100 * 12)) / (1 - (Math.pow((1 + (percent / (100 * 12))), -(months - 1)))));
        return monthPayment;
    }
}
