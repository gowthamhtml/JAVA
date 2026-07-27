abstract class payment {
    protected double amount;
    payment(double amount) {
        this.amount = amount;
    }

    abstract void pay();
    void receipt() {
        System.out.println("Receipt Generated");
        System.out.println("Amount Paid: " + amount);
    }

    void showPaymentStatus() {
        System.out.println("Payment successful");
    }

    public static void main(String[] args) {
        payment p1 = new UpiPayment(550.75, "Gowtham@okspi");
        payment p2 = new CardPayment(1250.50, "1234567966377");

        p1.pay();
        p1.receipt();
        p1.showPaymentStatus();

        System.out.println();

        p2.pay();
        p2.receipt();
        p2.showPaymentStatus();
    }
}

class UpiPayment extends payment {
    private String upiId;

    UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("Processing UPI payment...");
        System.out.println("UPI ID: " + upiId);
    }
}

class CardPayment extends payment {
    private String cardNumber;

    CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Processing card payment...");
        System.out.println("Card Number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
    }
}
public class main{
    public static void main(String[]args){
        payment p1 = new Upipayment (250.0,"gowtham@8145");
        p1.pay();
        p1.receipt();
        payment p2 = new cardpayment(50.0,"9363591456");
        p2.pay();
        p2.receipt();
        }
        };p[-
