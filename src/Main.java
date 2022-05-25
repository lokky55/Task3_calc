public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int summ = 1_000_000;
        double percent = 9.99;

        int monthPayment = (int) service.calculate(summ, 1, percent);
        System.out.println("Ваш ежемесячный платеж (в рублях): " + monthPayment);

        int monthPayment2 = (int) service.calculate(summ, 2, percent);
        System.out.println("Ваш ежемесячный платеж (в рублях): " + monthPayment2);

        int monthPayment3 = (int) service.calculate(summ, 3, percent);
        System.out.println("Ваш ежемесячный платеж (в рублях): " + monthPayment3);
    }
}
