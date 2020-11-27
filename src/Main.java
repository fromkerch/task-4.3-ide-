public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthPayment = service.calculate(1000000, 0.0999, 12 );
        System.out.println(monthPayment);

        double monthPayment1 = service.calculate(1000000, 0.0999, 24 );
        System.out.println(monthPayment1);

        double monthPayment2 = service.calculate(1000000, 0.0999, 36 );
        System.out.println(monthPayment2);

    }
}
