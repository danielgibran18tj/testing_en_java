package payments;

public interface Payment_Gateway { //pasarela de pago
    PaymentResponse requestPayment (PaymentRequest request);
}
