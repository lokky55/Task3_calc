public class CreditPaymentService {
    public float calculate(int summ, int years, float percent) {
        int months = years * 12;
        float intRate = percent / (100 * 12);
        float fraction = (float) (intRate / (1 - (Math.pow(1 + intRate, -months))));
        float monthPayment = summ * fraction;
        return monthPayment;
    }
}
