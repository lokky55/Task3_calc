public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthPayment = service.calculate(1_000_000, 3, 9.99F);
        System.out.print("Ваш ежемесячный платеж: ");
        System.out.printf("%.2f", monthPayment);
        System.out.print(" рублей");
    }
}
