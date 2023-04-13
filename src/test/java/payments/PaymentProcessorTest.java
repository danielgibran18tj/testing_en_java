package payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    private Payment_Gateway paymentGateway;
    private PaymentProcessor paymentProcessor;
    @Before  //este se ejecuta una vez antes de cada test - @BeforeClass en cambio se ejecuta una vez antes de todos los test
    public void setup(){
        paymentGateway = Mockito.mock(Payment_Gateway.class); //simulando el Payment_Gateway como clase
        paymentProcessor= new PaymentProcessor(paymentGateway); //proceso de pago
    }
    @Test
    public void payment_is_correct(){
        //PARTE 1. PREPARACION DE LOS OBJETOS
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        //PARTE 2. LLAMADA AL METODO QUE QUEREMOS CREAR
        boolean result = paymentProcessor.makePayment(1000);

        //PARTE 3. COMPROBACION DEL RESULTADO
        assertTrue(result);
    }
    @Test
    public void payment_is_wrong(){
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        boolean result = paymentProcessor.makePayment(1000);
        assertFalse(result);
    }
}