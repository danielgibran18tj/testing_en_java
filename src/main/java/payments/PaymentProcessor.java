package payments;

public class PaymentProcessor {
    private Payment_Gateway paymentGateway;

    public PaymentProcessor(Payment_Gateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount){
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        if (response.getStatus()== PaymentResponse.PaymentStatus.OK){
            return true;
        }else {
            return false;
        }
    }
}
