package payments;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    @Test
    public void payment_is_correct(){
        //PARTE 1. PREPARACION DE LOS OBJETOS
        Payment_Gateway paymentGateway = Mockito.mock(Payment_Gateway.class); //simulando el Payment_Gateway como clase
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        PaymentProcessor paymentProcessor= new PaymentProcessor(paymentGateway); //proceso de pago

        //PARTE 2. LLAMADA AL METODO QUE QUEREMOS CREAR
        boolean result = paymentProcessor.makePayment(1000);

        //PARTE 3. COMPROBACION DEL RESULTADO
        assertTrue(result);
    }
    @Test
    public void payment_is_wrong(){
        Payment_Gateway paymentGateway = Mockito.mock(Payment_Gateway.class); //pasarela de pago
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        PaymentProcessor paymentProcessor= new PaymentProcessor(paymentGateway); //proceso de pago

        boolean result = paymentProcessor.makePayment(1000);
        assertFalse(result);
    }
}